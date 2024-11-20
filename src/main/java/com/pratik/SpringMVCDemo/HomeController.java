package com.pratik.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	
	@ModelAttribute("course")
	public String courseName(){
		return "Java";
	}
	
	@RequestMapping("/")
	public String home() {
//		System.out.println("home method called");
		return "index";
	}

//	@RequestMapping("add")
//	public String add(HttpServletRequest req, HttpSession session) {
//		int num1=Integer.parseInt(req.getParameter("num1"));
//		int num2=Integer.parseInt(req.getParameter("num2"));
//	public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, HttpSession session) {
//	public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model) {
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelAndView mv) {
		int result=num1+num2;
		
//		session.setAttribute("result",result);
//		model.addAttribute("result",result);
		mv.addObject("result",result);
		mv.setViewName("result");
		
//		return result:
		return mv;
	}

//	@RequestMapping("addAlien")
//	public ModelAndView add(@RequestParam("aid") int aid,@RequestParam("aname") String aname, ModelAndView mv) {
//		Alien alien=new Alien();
//	 	alien.setAid(aid);
//	 	alien.setAname(aname);
//		
//	 	mv.addObject("alien",alien);
//	 	mv.setViewName("alien");
		
//		return mv;
//	}
//	public String add(@ModelAttribute("al1") Alien alien) {
//	if we dont have another name for the data, adding @ModelAttribute is optional
	@RequestMapping("addAlien")
	public String add(Alien alien) {
//		Alien alien=new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);
		
//		mv.addObject("alien",alien);
//		mv.setViewName("alien");
		
		return "alien";
	}
}
