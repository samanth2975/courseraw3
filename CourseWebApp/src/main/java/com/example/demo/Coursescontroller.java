package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Coursescontroller {
	@RequestMapping("courses")
	public String courses(HttpServletRequest req)
	{
		String cname = req.getParameter("name");
		System.out.println("The coursename is: " +cname);
		return "course";
	}

}
