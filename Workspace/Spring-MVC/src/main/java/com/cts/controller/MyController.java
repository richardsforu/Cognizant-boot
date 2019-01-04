package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.emp.model.Employee;

@Controller
@SessionAttributes
public class MyController {

	@RequestMapping(value = "/hello")
	public String f1() {
		System.out.println("--- Hello request proccessed.....");
		return "test";
	}
	
	@RequestMapping("/s1")
	public String f2(Model data) {
		data.addAttribute("name","Ozvitha fernz");
		return "names";
	}
	
	@RequestMapping("s2")
	public ModelAndView f3() {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("form");
		mav.addObject("city", "Hyderabad");
		
		return mav;
	}
	
	@RequestMapping("s3")
	public ModelAndView f4(@RequestParam("empId") int empId,@RequestParam("empName") String empName,@RequestParam("salary") double sal) {
		System.out.println("-- empId: "+empId);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("emp");
		mav.addObject("city", "Hyderabad");
		
		mav.addObject("id", empId);
		mav.addObject("name",empName);
		mav.addObject("totalSal", sal);
		return mav;
	}
	
	
	@RequestMapping("s4")
	public ModelAndView f5(@ModelAttribute Employee emp) {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("emp");
		mav.addObject("employee", emp);
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	

}
