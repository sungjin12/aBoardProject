package kr.co.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@RequestMapping("/")
	String home(){
		return "Hello World!";
	}
}
