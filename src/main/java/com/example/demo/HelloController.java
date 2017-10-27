package com.example.demo;

import org.springframework.security.oauth2.client.authentication.OAuth2UserAuthenticationToken;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String hello(OAuth2UserAuthenticationToken token, Model model) {
		DefaultOAuth2User principal = (DefaultOAuth2User) token.getPrincipal();
		model.addAttribute("who", principal.getName());
		return "greeting";
	}
	
}
