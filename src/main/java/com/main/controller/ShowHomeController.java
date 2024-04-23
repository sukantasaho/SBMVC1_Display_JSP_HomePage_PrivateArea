package com.main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.javafaker.Faker;
import com.main.service.DateConverterService;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller 
public class ShowHomeController {
    
	@Autowired
	private ServletConfig sc;
	
	@Autowired
	private ServletContext sctx;
	
	/*@RequestMapping("/home") 
	public String displayHome() 
	{ 
	  return "welcome"; 
	}*/
	/*@RequestMapping("/home")
	public String getHome(Map<String,Object> map)
	{
		map.put("showDate", new Date());
		map.put("age", new Random().nextInt(100));
		
		return "welcome";
	}*/
	
	/*@RequestMapping("/home")
	public String getHome(ModelMap map)
	{
		map.put("showDate", new Date());
		map.put("age", new Random().nextInt(100));
		System.out.println("ModelMap Executed");
		
		return "welcome";
	}*/
	
	/*@RequestMapping("/home")
	public String getHome(BindingAwareModelMap map)
	{
		map.addAttribute("showDate",new Date());
		map.addAttribute("age", new Random().nextInt(100));
		System.out.println("BindingAwareModelMap Executed");
		
		return "home";
	}*/
	
	/*@RequestMapping("/home")
	 public Model getModelData()
	 {
		 Model model = new BindingAwareModelMap();
		 model.addAttribute("sysDate", new Date());
		 model.addAttribute("age", new Random().nextInt(100));
		 
		 return model;
	 }*/
	/*@RequestMapping("/home")
	 public Map<String,Object> getModelData()
	 {
		Map<String,Object> map  = new HashMap<String, Object>();
		 map.put("sysDate", new Date());
		 map.put("age", new Random().nextInt(100));
		 Faker faker = Faker.instance();
		 
		 map.put("name", faker.name().firstName());
		 map.put("address", faker.address().city());
		 
		 
		 return map;
	 }*/
	
	/*@RequestMapping("/home")
	 public ModelAndView getModelData()
	 {
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("sysDate", LocalDate.now());
		 mav.addObject("age", new Random().nextInt(100));
		 mav.setViewName("welcome");
		 
		 return mav;
	 }*/
		/*@RequestMapping("/date")
		public ModelAndView displayDate()
		{
			LocalDateTime ldt = LocalDateTime.now();
			int month = ldt.getMonthValue();
			DateConverterService service = new DateConverterService();
			String mmm = service.convertMonthValueToString(5);
			int year = ldt.getYear();
			int day = ldt.getDayOfMonth();
			String formattedDate = day+"-"+mmm+"-"+year;
			 ModelAndView mav = new ModelAndView();
			mav.addObject("sysDate", formattedDate);
			mav.addObject("age", new Random().nextInt(100));
			mav.addObject("name","Sukanta");
			mav.addObject("ldt", LocalDate.now());
			mav.setViewName("display_date");
			
			return mav;
		}*/
	
	//forward req one handler to another handler
	/*@RequestMapping("/home")
	 public String displayHome()
	 {
		 
		 return "forward:report";
	 }
	@RequestMapping("/report")
	public String displayReport(Map<String,Object> map)
	{
		map.putIfAbsent("sysDate", new Date());
		map.put("age", new Random().nextInt(100));
		
		return "report_page";
	}*/
	//Redirect 
	/*@RequestMapping("/home")
	 public String displayHome()
	 {
		 
		 return "redirect:report";
	 }
	@RequestMapping("/report")
	public String displayReport(Map<String,Object> map)
	{
		map.putIfAbsent("sysDate", new Date());
		map.put("age", new Random().nextInt(100));
		
		return "report_page";
	}*/
	
	/*@RequestMapping("/report")
	public String displayReport(HttpServletRequest req, HttpServletResponse res)
	{
		 req.setAttribute("sysDate", LocalDate.now());
		 req.setAttribute("name", "Sukanta");
		return "report_page";
	}*/
	
	/*@RequestMapping("/home")
	 public String displayHome(HttpSession session)
	 {
		    session.setAttribute("sysDate", LocalDate.now());
		    session.setAttribute("age", new Random().nextInt(100));
		    
		 return "welcome";
	 }*/
	
	/*@RequestMapping("/home")
	public String displayHome()
	{
		System.out.println("Web Application Name : "+sctx.getContextPath());
		System.out.println("DS Logical Name : "+sc.getServletName());
		return "welcome";
	}*/
	
	@RequestMapping(value = "/process", method = RequestMethod.GET)
	public void process(HttpServletResponse res) throws IOException
	{
		//get PrintWriter Object
		 PrintWriter pw = res.getWriter();
		 //set contentType
		 res.setContentType("text/html");
		 pw.println("<h1 style='color:red;text-align:center'>Welcome Java Programming</h1>");
		 pw.close();
	}
}
