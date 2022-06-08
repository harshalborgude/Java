package org.hrb;

import org.hrb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

// working of model and view , radio button and forms.
@Controller
public class MainController {

	@GetMapping("/message")
	public ModelAndView welcome() {
		ModelAndView modelAndView=new ModelAndView("messages");
		//System.out.println("inside message!");
		return modelAndView;
	}

	@RequestMapping("/displayMessage")
	public ModelAndView displayUserInfo(@RequestParam("message") String msg) {
		//System.out.println("inside displayMessage!");
		ModelAndView modelAndView=new ModelAndView("displayMessage");
		
		System.out.println("*****************************");
		System.out.println(msg);
		
		System.out.println("*****************************");
		return modelAndView;
	}
	
	
	
}














