package com.pdselatan.controller.master;

import java.security.Principal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.common.Tools;
import com.pdselatan.controller.attribute.MasterEmployeeAttribute;
import com.pdselatan.model.Role;
import com.pdselatan.model.User;
import com.pdselatan.model.UserRole;
import com.pdselatan.service.RoleService;
import com.pdselatan.service.UserRoleService;
import com.pdselatan.service.UserService;

@Controller
@Scope("session")
@RequestMapping(value= "/master")
public class PegawaiController {

	protected static Logger logger = Logger.getLogger(MasterController.class);
	private static final String PEGAWAI = "master.pegawai";
	private static final String TAMBAH_PEGAWAI = "master.tambah-pegawai";
	private static final String ACTION = "action";
	private static final String ACTION_DELETE = "delete";
	private static final String ACTION_ADD = "add";
	private static final String ACTION_EDIT = "edit";
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserRoleService userRoleService;
	
	MasterEmployeeAttribute savedAttr = new MasterEmployeeAttribute();
	@RequestMapping("pegawai")
	public ModelAndView pegawai(HttpServletRequest request){
		
		ModelAndView mav = new ModelAndView();
		
		String action = request.getParameter(ACTION);
		if(action!=null && action.equalsIgnoreCase(ACTION_DELETE)){
			String userId = request.getParameter("id");
			userRoleService.deleteUserRoleByUserId(Integer.parseInt(userId));
			userService.deleteUser(userId);
		}
			
		
		List<User> userList = userService.findUsers("empName", "", MatchMode.ANYWHERE);
		System.out.println("SIZE = " + userList.size());
		System.out.println("EMP NAME = " + userList.get(0).getEmpName());
		savedAttr.setUserList(userList);
		mav.addObject("form", savedAttr);
		mav.setViewName(PEGAWAI);						
		return mav;
	}
	
	
	@RequestMapping("searchEmployee")
	public ModelAndView searchEmployee(@ModelAttribute("form") MasterEmployeeAttribute attr, HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		
		List<User> userList = userService.findUsers("empName", attr.getUserNameSearch(), MatchMode.ANYWHERE);
		savedAttr.setUserList(userList);
		mav.addObject("form", savedAttr);
		mav.setViewName(PEGAWAI);				
		return mav;
		
	}
	
	
	@RequestMapping("tambah-pegawai")
	public ModelAndView tambahPegawai(@ModelAttribute("form") MasterEmployeeAttribute attr, HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		
		String action = request.getParameter(ACTION);
		
		//Get user roles list
		HashMap<String, Role> mapRoles = new HashMap<String, Role>();		
		savedAttr.setRoleList(roleService.findRoles("", MatchMode.ANYWHERE));
		for(Role r : savedAttr.getRoleList()){
			mapRoles.put(String.valueOf(r.getRoleId()), r);
		}
		
		savedAttr.setRoleMap(mapRoles);
		
		if(action.equalsIgnoreCase(ACTION_EDIT)){
			System.out.println("SIZE = " + request.getParameter("id"));
			savedAttr.setUserAddOrUpdate(userService.findUserById(request.getParameter("id")));
			
			//Mapping User details
			savedAttr.setEmpNameNew(savedAttr.getUserAddOrUpdate().getEmpName());
			savedAttr.setEmpPhoneNew(savedAttr.getUserAddOrUpdate().getEmpPhone());
			savedAttr.setPasswordNew(savedAttr.getUserAddOrUpdate().getPassword());
			savedAttr.setUserIdSelected(String.valueOf(savedAttr.getUserAddOrUpdate().getUserId()));
			savedAttr.setUserNameNew(savedAttr.getUserAddOrUpdate().getUsername());
			savedAttr.setEmpAddressNew(savedAttr.getUserAddOrUpdate().getEmpAddress());
			
			
			String[] roleStr = new String[savedAttr.getUserAddOrUpdate().getRoles().size()];
			int idx = 0;
			for (UserRole s : savedAttr.getUserAddOrUpdate().getRoles()) {
			    roleStr[idx] = String.valueOf(s.getRoleId().getRoleId());
			    idx++;
			}
			
			savedAttr.setRolesSelected(roleStr);

		} else if(action.equalsIgnoreCase(ACTION_ADD)){
			savedAttr.setUserAddOrUpdate(new User());
		}
		
		mav.addObject("form", savedAttr);
		mav.setViewName(TAMBAH_PEGAWAI);						
		return mav;
	}
	
	@RequestMapping("saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute("form") MasterEmployeeAttribute attr, HttpServletRequest request, Principal principal){
		System.out.println("PASSWORD = " + attr.getRolesSelected()[0]);
		System.out.println("ADDRESS = " + attr.getEmpAddressNew());
		ModelAndView mav = new ModelAndView();
		
		User userModified = savedAttr.getUserAddOrUpdate();
		userModified.setEmpAddress(attr.getEmpAddressNew());
		userModified.setEmpName(attr.getEmpNameNew());
		userModified.setEmpPhone(attr.getEmpPhoneNew());
		
		if(savedAttr.getPasswordNew()==null){
			userModified.setPassword(Tools.encryptPassNow(attr.getPasswordNew()));
		} else if(!savedAttr.getPasswordNew().equalsIgnoreCase(attr.getPasswordNew())){
			userModified.setPassword(Tools.encryptPassNow(attr.getPasswordNew()));
		}
		
		userModified.setUsername(attr.getUserNameNew());
		userModified.setCreatedBy(principal.getName());
		
		//adding roles
		Set<UserRole> roles = new HashSet<UserRole>();
		for(int i=0; i < attr.getRolesSelected().length; i++){
				String roleSelected = attr.getRolesSelected()[i];
				UserRole newRole = new UserRole();
				newRole.setUser(userModified);
				newRole.setRoleId(savedAttr.getRoleMap().get(roleSelected));
				roles.add(newRole);
		}			
		
		userModified.setRoles(roles);
		
		userService.saveUser(userModified);
		
		//remove all roles and add new roles
		userRoleService.deleteUserRoleByUserId(userModified.getUserId());
		for(UserRole r : roles){
			userRoleService.saveUserRole(r);
		}
		
		
		List<User> userList = userService.findUsers("empName","", MatchMode.ANYWHERE);
		MasterEmployeeAttribute attrNew = new MasterEmployeeAttribute();
		attrNew.setUserList(userList);
		mav.addObject("form", attrNew);
		mav.setViewName(PEGAWAI);						
		return mav;
	}
	
}
