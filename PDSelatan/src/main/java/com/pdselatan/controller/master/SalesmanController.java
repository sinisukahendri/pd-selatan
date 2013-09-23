package com.pdselatan.controller.master;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.controller.attribute.SalesmanAttribute;
import com.pdselatan.model.Salesman;
import com.pdselatan.service.SalesmanService;

@Controller
@RequestMapping(value= "/master")
public class SalesmanController {

	protected static Logger logger = Logger.getLogger(BankController.class);
	
	private static final String SALES = "master.sales";
	private static final String TAMBAH_SALES = "master.tambah-sales";
	
	@Autowired
	private SalesmanService salesmanService;
	private SalesmanAttribute salesmanForm;
	
	@RequestMapping("sales")
	public ModelAndView sales(ModelAndView mav, SalesmanAttribute form){
		salesmanForm = new SalesmanAttribute();
		
		if(form.getFilter()!=null)
			salesmanForm.setSalesmans(salesmanService.findSalesmansByName(form.getFilter(),MatchMode.ANYWHERE));
		else
			salesmanForm.setSalesmans(salesmanService.findSalesmansByName("",MatchMode.ANYWHERE));
		
		mav.addObject("form",salesmanForm);
		mav.setViewName(SALES);						
		return mav;
	}	
	@RequestMapping("tambah-sales")
	public ModelAndView tambahSales(ModelAndView mav, SalesmanAttribute form){
		Salesman savedSalesman = new Salesman();
		if(form.getSavedSalesman()!=null){
			savedSalesman = form.getSavedSalesman();
			salesmanService.saveOrUpdateSalesman(savedSalesman);
		}
		mav.setViewName(TAMBAH_SALES);						
		return mav;
	}
	
	@RequestMapping("delete-sales")
	public ModelAndView deleteSales(ModelAndView mav,SalesmanAttribute form){
		Salesman deletedSalesman = new Salesman();
		if(form.getDeletedSalesman()!=null){
			deletedSalesman.setSalesmanId(Double.parseDouble(form.getDeletedSalesman()));
//			salesmanService.deleteSalesman(deletedSalesman);
			logger.error("Bank Deleted id:"+deletedSalesman.getSalesmanId());
		}

		salesmanForm.setSalesmans(salesmanService.findSalesmansByName("",MatchMode.ANYWHERE));
		mav.addObject("form",salesmanForm);
		mav.setViewName(SALES);
		return mav;
	}
}
