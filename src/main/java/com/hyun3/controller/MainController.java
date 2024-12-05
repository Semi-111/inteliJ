package com.hyun3.controller;

import java.io.IOException;


import com.hyun3.mvc.annotation.Controller;
import com.hyun3.mvc.annotation.RequestMapping;
import com.hyun3.mvc.view.ModelAndView;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MainController {


	@RequestMapping("/main")
	public ModelAndView main(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ModelAndView mav = new ModelAndView("main/main");
		
		return mav;
	}

	
	public void killMe(){
		System.out.println("인텔리제이 마지막의 마지막 테스트");
	}
	
	
}