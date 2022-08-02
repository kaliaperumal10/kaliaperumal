package mycontroler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/bs2")
public class BasicController2 {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
public String sayhello(HttpServletRequest request) {
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello1")
	public String sayHello2(Model model) {
		model.addAttribute("myobj","Welcome to springboot................");
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello2")
	public ModelAndView sayHello3() {
		ModelAndView mandv=new ModelAndView();
		mandv.addObject("myobj","this is obj value.....");
		mandv.setViewName("home");
		return mandv;
	}
}
