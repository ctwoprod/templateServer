package template.app.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import template.app.dao.InstansiDao;
import template.app.entities.Instansi;

/**
 * Class untuk test page controller
 */

@Controller
public class TestController {
	@Inject
	private InstansiDao instansiDao;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String index(ModelMap map, ModelMap model, HttpSession session) {
		return "index";
	}

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(ModelMap map, ModelMap model, HttpSession session) {
		List<Instansi> listInstansi = instansiDao.findAll(null);
		for (Instansi instansi : listInstansi) {
			System.out.println("nama " + instansi.getNama());
		}
		return "test";
	}

	// blank page
	@RequestMapping(value = "/blank.do", method = RequestMethod.GET)
	public String blank(ModelMap map, ModelMap model, HttpSession session) {
		return "blank";
	}	
}
