package com.tutorial.tutorial;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/page")
	public String page() {
		return "page";
	}

}