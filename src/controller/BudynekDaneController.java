package controller;

import model.BudynekDane;
import model.Odczyt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.BudynekDaneBean;
import bean.OdczytBean;
import service.BudynekDaneService;

@Controller
public class BudynekDaneController {
	
	@Autowired
	private BudynekDaneService budynekDaneService;
	
	@RequestMapping(value = "/zapiszBudynekDane", method = RequestMethod.POST)
	public ModelAndView zapiszBudynekDane(@ModelAttribute("command") BudynekDaneBean budynekDaneBean, 
			BindingResult result){
		BudynekDane budynekDane = prepareModel(budynekDaneBean);
		budynekDaneService.addBudynekDane(budynekDane);
		return new ModelAndView("redirect:/listaBudynekDane.html");		
	}

	private BudynekDane prepareModel(BudynekDaneBean budynekDaneBean) {
		BudynekDane budynekDane  = new BudynekDane();
		
		return null;
	}

}
