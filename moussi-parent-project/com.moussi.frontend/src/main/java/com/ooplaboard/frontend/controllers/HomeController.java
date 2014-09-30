package com.ooplaboard.frontend.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	 @RequestMapping("/")
	    public String root() {
	        return "redirect:/welcome.html";
	    }

	    
	    /* Home page. */
	    @RequestMapping("/welcome")
	    public String index() {
	        return "welcome.html";
	    }
	    
	    /* Home page. */
	    @RequestMapping("/error")
	    public String error() {
	        return "error.html";
	    }
}