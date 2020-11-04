package com.oauth.login.example.login.with.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class LoginWithFacebookApplication {

//	@GetMapping("/")
//	public String welcome(Principal principal) {
//		Map<String, Object> details;
//		details = (Map<String, Object>)
//				((OAuth2Authentication) principal).getUserAuthentication().getDetails();
//		String userName = (String) details.get("name");
//		return "Hi " + userName + " Welcome to my application !!";
//	}

	public static void main(String[] args) {
		SpringApplication.run(LoginWithFacebookApplication.class, args);
	}

}
