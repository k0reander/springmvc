package com.packt.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.model.LoginInfo;

@Controller
@Scope("session")
public class LoginController {
	
	@RequestMapping({"/", "/login"})
	public String onStartUp(ModelMap model) {
		model.addAttribute("loginInfo", new LoginInfo());
		return "login";
	}
	
	@RequestMapping(value="/onLogin", method=RequestMethod.POST)
	public String onLogin(@ModelAttribute("loginInfo") LoginInfo loginInfo, ModelMap model) {
		if(!"junit".equals(loginInfo.getUserId())){
			model.addAttribute("error", "Invalid User name");
			return "login";
		}
		if(!"password".equals(loginInfo.getPassword())){
			model.addAttribute("error", "Invalid password");
			return "login";
		}
		model.addAttribute("name", "junit user");		
		return "greetings";
	}
}
