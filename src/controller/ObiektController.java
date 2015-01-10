package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import model.Obiekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.ObiektBean;
import service.ObiektService;

@Controller
public class ObiektController {

	@Autowired
	private ObiektService obiektService;

	@RequestMapping(value = "/zapiszObiekt", method = RequestMethod.POST)
	public String zapiszObiekt(
			@ModelAttribute("command") @Valid ObiektBean obiektBean,
			BindingResult result) {
		if (result.hasErrors()) {
			return "dodajObiekt";
		} else {
			Obiekt obiekt = prepareModel(obiektBean);
			obiektService.addObiekt(obiekt);
			return "listaObiektow";
		}
	}
	
	@RequestMapping(value = "/listaObiektow", method = RequestMethod.GET)
	public ModelAndView listaObiektow() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("listaObiektow", prepareListofBean(obiektService.listaObiektow()));
		return new ModelAndView("listaObiektow", model);
	}

	@RequestMapping(value = "/usunObiekt", method = RequestMethod.GET)
	public ModelAndView deleteObiekt(
			@ModelAttribute("command") ObiektBean obiektBean, BindingResult result) {
		obiektService.usunObiekt(prepareModel(obiektBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("dodajObiekt", null);
		return new ModelAndView("listaObiektow", model);
	}
	
	@RequestMapping(value = "/edytujObiekt", method = RequestMethod.GET)
	public ModelAndView edytujObiekt(
			@ModelAttribute("command") ObiektBean obiektBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("obiekt", prepareObiektBean(obiektService.getObiekt(obiektBean.getId())));
		return new ModelAndView("dodajObiekt", model);
	}
	
	@RequestMapping(value = "/otworzObiekt", method = RequestMethod.GET)
	public ModelAndView otworzObiekt(
			@ModelAttribute("command") ObiektBean obiektBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("obiekt", prepareObiektBean(obiektService.getObiekt(obiektBean.getId())));
		return new ModelAndView("otworzObiekt", model);
	}

	@RequestMapping(value = "/obiekt", method = RequestMethod.GET)
	public ModelAndView dodajObiekt(@ModelAttribute("command") ObiektBean obiektBean, BindingResult result) {
		return new ModelAndView("dodajObiekt");
	}
	
	@RequestMapping(value = "/open", method = RequestMethod.GET)
	public ModelAndView openObiekt(
			@ModelAttribute("command") ObiektBean obiektBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("obiekt",
				prepareObiektBean(obiektService.getObiekt(obiektBean.getId())));
		return new ModelAndView("openObiekt", model);
	}
	
	private Obiekt prepareModel(ObiektBean obiektBean) {
		Obiekt obiekt = new Obiekt();
		obiekt.setObiektNazwa(obiektBean.getNazwa());
		obiekt.setObiektPowierzchnia(obiektBean.getPowierzchnia());
		obiekt.setObiektKubatura(obiektBean.getKubatura());
		obiekt.setObiektLiczbaUzytkownikow(obiektBean.getLiczbaUzytkownikow());
		obiekt.setObiektCzyCalodobowy(obiektBean.getCzyCalodobowy());
		obiekt.setObiektId(obiektBean.getId());
		obiektBean.setId(null);
		return obiekt;
	}

	private ObiektBean prepareObiektBean(Obiekt obiekt) {
		ObiektBean bean = new ObiektBean();
		bean.setNazwa(obiekt.getObiektNazwa());
		bean.setPowierzchnia(obiekt.getObiektPowierzchnia());
		bean.setKubatura(obiekt.getObiektKubatura());
		bean.setLiczbaUzytkownikow(obiekt.getObiektLiczbaUzytkownikow());
		bean.setCzyCalodobowy(obiekt.isObiektCzyCalodobowy());
		bean.setId(obiekt.getObiektId());
		return bean;
	}
	
	private List<ObiektBean> prepareListofBean(List<Obiekt> obiekty) {
		List<ObiektBean> beans = null;
		if (obiekty != null && !obiekty.isEmpty()) {
			beans = new ArrayList<ObiektBean>();
			ObiektBean bean = null;
			for (Obiekt obiekt : obiekty) {
				bean = new ObiektBean();
				bean.setId(obiekt.getObiektId());
				bean.setNazwa(obiekt.getObiektNazwa());
				bean.setPowierzchnia(obiekt.getObiektPowierzchnia());
				bean.setKubatura(obiekt.getObiektKubatura());
				bean.setLiczbaUzytkownikow(obiekt.getObiektLiczbaUzytkownikow());
				bean.setCzyCalodobowy(obiekt.isObiektCzyCalodobowy());
				beans.add(bean);
			}
		}
		return beans;
	}


}
