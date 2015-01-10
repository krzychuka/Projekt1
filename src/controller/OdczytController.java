package controller;

import java.util.HashMap;
import java.util.Map;

import model.Odczyt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.OdczytBean;
import service.OdczytService;

@Controller
public class OdczytController {

	@Autowired
	private OdczytService odczytService;
	
	@RequestMapping(value = "/zapiszOdczyt", method = RequestMethod.POST)
	public ModelAndView zapiszOdczyt(@ModelAttribute("command") OdczytBean odczytBean, 
			BindingResult result){
		Odczyt odczyt = prepareModel(odczytBean);
		odczytService.addOdczyt(odczyt);
		return new ModelAndView("redirect:/odczyty.html");		
	}
	
	@RequestMapping(value = "/usunOdczyt", method = RequestMethod.GET)
	public ModelAndView deleteOdczyt(@ModelAttribute("command") OdczytBean odczytBean,
			BindingResult result){
		odczytService.deleteOdczyt(prepareModel(odczytBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("dodajOdczyt", null);
		return new ModelAndView("listaOdczytow", model);
	}
	
	@RequestMapping(value = "/edytujOdczyt", method = RequestMethod.GET)
	public ModelAndView edytujOdczyt(
			@ModelAttribute("command") OdczytBean odczytBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("odczyt", prepareOdczytBean(odczytService.getOdczyt(odczytBean.getId())));
		return new ModelAndView("dodajOdczyt", model);
	}

	@RequestMapping(value = "/odczyt", method = RequestMethod.GET)
	public ModelAndView dodajOdczyt(@ModelAttribute("command") OdczytBean odczytBean, BindingResult result) {
		return new ModelAndView("dodajOdczyt");
	}
	
	@RequestMapping(value = "/odczyty", method = RequestMethod.GET)
	public String listowOdczytow(ModelMap model) {

		return "listaOdczytow";

	}
	
	@RequestMapping(value = "/odczytyPLN", method = RequestMethod.GET)
	public String listowOdczytowPLN(ModelMap model) {

		return "listaOdczytowPLN";

	}

	private Odczyt prepareModel(OdczytBean odczytBean) {
		Odczyt odczyt = new Odczyt();
		odczyt.setOdczytData(odczytBean.getData());
		odczyt.setOdczytOkresPoczatek(odczytBean.getOkresPoczatek());
		odczyt.setOdczytOkresKoniec(odczytBean.getOkresKoniec());
		odczyt.setCieploGJ(odczytBean.getCieploGJ());
		odczyt.setCieploPLN(odczytBean.getCieploPLN());
		odczyt.setEnergiaKWH(odczytBean.getEnergiaKWH());
		odczyt.setEnergiaPLN(odczytBean.getEnergiaPLN());
		odczyt.setGazNM3(odczytBean.getGazNM3());
		odczyt.setGazPLN(odczytBean.getGazPLN());
		odczyt.setWodaM3(odczytBean.getWodaM3());
		odczyt.setWodaPLN(odczytBean.getWodaPLN());
		odczyt.setObiektId(odczytBean.getObiektId());
		odczyt.setOdczytId(odczytBean.getId());
		odczytBean.setId(null);
		return odczyt;
	}
	
	private Object prepareOdczytBean(Odczyt odczyt) {
		OdczytBean bean = new OdczytBean();
		bean.setData(odczyt.getOdczytData());
		bean.setOkresPoczatek(odczyt.getOdczytOkresPoczatek());
		bean.setOkresKoniec(odczyt.getOdczytOkresKoniec());
		bean.setCieploGJ(odczyt.getCieploGJ());
		bean.setCieploPLN(odczyt.getCieploPLN());
		bean.setEnergiaKWH(odczyt.getEnergiaKWH());
		bean.setEnergiaPLN(odczyt.getEnergiaPLN());
		bean.setGazNM3(odczyt.getGazNM3());
		bean.setGazPLN(odczyt.getGazPLN());
		bean.setWodaM3(odczyt.getWodaM3());
		bean.setWodaPLN(odczyt.getWodaPLN());
		bean.setObiektId(odczyt.getObiektId());
		bean.setId(odczyt.getOdczytId());
		return bean;
	}
}
