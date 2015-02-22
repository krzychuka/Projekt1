package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransportController {

	@RequestMapping(value = "/transport.html", method = RequestMethod.GET)
	public String listaBukip(ModelMap model) {

		return "transport";

	}
}
