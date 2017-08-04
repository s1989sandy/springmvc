package com.emc.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.emc.springmvc.model.Student;

@Controller
public class StudentController {

	Map<String, Student> m = new HashMap<>();

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public String getStudent(@ModelAttribute("stud") Student stud) {

		return "student.jsp";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("stud") Student stud) {
		System.out.println(stud.getName());
		System.out.println(stud.getPhone());
		System.out.println(stud.getAge());
		m.put(stud.getName(), stud);
		return "student.jsp";
	}

}
