package mycontroler;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form1")
public class FormController {
	@RequestMapping(method = RequestMethod.GET,value="/register")
	public ModelAndView loadforn() {
		ModelAndView mandv =new ModelAndView();
		mandv.addObject("userobj",new User());
		mandv.setViewName("userform");
		return mandv;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ModelAndView processForm(@Valid @ModelAttribute("userobj") User user,BindingResult result) {
		ModelAndView mandv=new ModelAndView();
		if(result.hasErrors()) {
			mandv.setViewName("userform");
			return mandv;
		}else {
		System.out.println("Username...:"+user.getUname());
		user.setUname(user.getUname()+" anound technologies...");
		mandv.addObject("myuser",user);
		mandv.setViewName("welcome");
		return mandv;
	}	
	}
}