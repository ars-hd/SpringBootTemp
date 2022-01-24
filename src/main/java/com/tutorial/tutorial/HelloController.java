package com.tutorial.tutorial;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/page")
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/page")
    @ResponseBody
>>>>>>> 542191ebf8d39f4a1798dd6ba9bc36c8a8b61375
	public String page() {
		return "page";
	}

}