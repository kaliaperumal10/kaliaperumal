package com.example.demo;



import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/cli")
public class ClientController {
	
	@Autowired
	MessageSource ss;
	private ClientServices cs;
	public ClientServices getSt() {
		return cs;
	}
	public void setSt(ClientServices cs) {
		this.cs = cs;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/page")
	public ModelAndView websearch() {
		
		ModelAndView mv=new ModelAndView();
		Client d=new Client();
		d.setFlag(0);
		int a=d.getCid()+1;
		d.setCid(a);
		mv.addObject("user", d);
		mv.setViewName("register");
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/page")
	public ModelAndView welcome(@Valid @ModelAttribute("user") Client d,BindingResult result,HttpServletRequest request ) {
		
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("register");
			return mv;
		}else {
		System.out.println(d.getName());
		
		String pass1=request.getParameter("pass1");
		
		String pass2=request.getParameter("pass2");
		
		if(pass1.equals(pass2)) {
		
		List<Client> a=cs.checkCID(d);
		
		Iterator<Client> itr=a.iterator();
		
		int b=0;
		while(itr.hasNext()) {
		b=itr.next().getCid();
		}
		
		
		
		System.out.println(b);
		d.setCid(b+1);
		mv.addObject("user", d);
		cs.saveData(d);
		mv.setViewName("dummy");
		return mv;
		}
		else
		{
			mv.setViewName("error");
			return mv;
			}
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/page1")
	public ModelAndView websearch1() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("login");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/page1")
	public ModelAndView welcome1(HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		String name=request.getParameter("name");
		
		String pass1=request.getParameter("pass1");
		
		System.out.println(name+":"+pass1);
		
		List<Client> c=cs.checkUser(name, pass1);
		
		Iterator<Client> itr=c.iterator();
		
		while(itr.hasNext()) {
			
			mv.setViewName("dummy");
			
			return mv;
			
		}
		mv.setViewName("error");
		return mv;
		
	}
}







