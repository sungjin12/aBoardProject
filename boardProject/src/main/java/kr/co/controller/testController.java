package kr.co.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
	@RequestMapping("/")
	public ModelAndView getBlog(ModelAndView mv) {
		mv.addObject("Title", "hello");
		mv.addObject("message", "hi");
		mv.setViewName("test");
		return mv;
	}
}
