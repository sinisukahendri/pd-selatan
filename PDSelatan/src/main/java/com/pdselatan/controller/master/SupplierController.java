package com.pdselatan.controller.master;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.controller.attribute.SupplierAttribute;
import com.pdselatan.model.Supplier;
import com.pdselatan.service.SupplierService;

@Controller
@RequestMapping(value= "/master")
public class SupplierController {

	protected static Logger logger = Logger.getLogger(SupplierController.class);

	private static final String SUPPLIER = "master.supplier";
	private static final String TAMBAH_SUPPLIER = "master.tambah-supplier";
	
	@Autowired
	private SupplierService supplierService;
	private SupplierAttribute supplierForm;
	
	@RequestMapping("supplier")
	public ModelAndView supplier(ModelAndView mav, SupplierAttribute form){
		supplierForm = new SupplierAttribute();
		
		if(form.getFilter()!=null)
			supplierForm.setSuppliers(supplierService.findSuppliersByName(form.getFilter(),MatchMode.ANYWHERE));
		else
			supplierForm.setSuppliers(supplierService.findSuppliersByName("",MatchMode.ANYWHERE));
		
		mav.addObject("form",supplierForm);
		mav.setViewName(SUPPLIER);						
		return mav;
	}	
	
	@RequestMapping("tambah-supplier")
	public ModelAndView tambahSupplier(ModelAndView mav, SupplierAttribute form){
		Supplier savedSupplier = new Supplier();
		if(form.getSavedSupplier()!=null){
			savedSupplier = form.getSavedSupplier();
			supplierService.saveOrUpdateSupplier(savedSupplier);
		}
		mav.setViewName(TAMBAH_SUPPLIER);						
		return mav;
	}
	
	@RequestMapping("delete-supplier")
	public ModelAndView deleteSupplier(ModelAndView mav,SupplierAttribute form){
		Supplier deletedSupplier = new Supplier();
		if(form.getDeletedSupplier()!=null){
			deletedSupplier.setSupplierId(Double.parseDouble(form.getDeletedSupplier()));
//			supplierService.deleteSupplier(deletedSupplier);
			logger.error("Spuulier Deleted id:"+deletedSupplier.getSupplierId());
		}

		supplierForm.setSuppliers(supplierService.findSuppliersByName("",MatchMode.ANYWHERE));
		mav.addObject("form",supplierForm);
		mav.setViewName(SUPPLIER);
		return mav;
	}
}
