package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 
public class exampleController {
	@GetMapping("display")
	public String myController() {
		return "Welcome";
	}
}