package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhonebookController {
	
	//필드
	//생성자
	//메서드 gs
	//메서드 일반
	
	
	//등록폼

	@RequestMapping(value="/writeform", method= {RequestMethod.GET, RequestMethod.POST})
	public String writeForm() {
		System.out.println("phonebookController.writeForm()");
		
		
	return "WEB-INF/views/writeForm.jsp";
	
	}
	//등록
		
	p
		
		
	//리스트
		
		
		
		
		
		
	
	
	

}
