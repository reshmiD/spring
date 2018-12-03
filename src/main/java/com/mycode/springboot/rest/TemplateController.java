package com.mycode.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/view")
public class TemplateController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/list")
    public String handleRequest(Model model) {
         
        String message = "Customer List:";
         
        model.addAttribute("message", message);
        model.addAttribute("customers", customerService.loadAll());
 
        return "customer_list";
    }
	

}
