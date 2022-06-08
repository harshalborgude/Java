package org.hrb;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@RequestMapping("welcome")
	public String welcome() {
		System.out.println("Inside Controller!");
		return "welcome Spring Boot";
	}
	
}
