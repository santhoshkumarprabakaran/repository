package com.example.live.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/home")
	public String main() {
		return "helloworld";
	}
	
}
