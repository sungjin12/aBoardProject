package kr.co.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.domain.User;
import kr.co.repository.UserRepository;

@RestController
public class testController {
	@Autowired private UserRepository userRepository;
	
	@RequestMapping("/")
	String home(){
		return "Hello World!";
	}
	
	@RequestMapping("/users")
    public @ResponseBody List<User> getUserList() {
        return userRepository.findAll();
    }
}
