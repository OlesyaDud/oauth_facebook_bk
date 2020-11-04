package com.oauth.login.example.login.with.facebook;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;


@RestController
@RequestMapping
@EnableWebSecurity
public class HelloController {

	@GetMapping("/hello")
	public String welcome(Principal principal) {
		Map<String, Object> details;
		details = (Map<String, Object>)
				((OAuth2Authentication) principal).getUserAuthentication().getDetails();
		String userName = (String) details.get("name");
		return "Hi, " + userName + " welcome !!";
	}
}
