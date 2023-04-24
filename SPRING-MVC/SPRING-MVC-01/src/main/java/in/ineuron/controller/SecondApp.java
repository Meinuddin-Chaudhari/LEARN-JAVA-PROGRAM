package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/second")
public class SecondApp {

	@RequestMapping("/welcome")
	public ModelAndView displayMsg()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", " Welcome to Second Application...!");
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/java")
	public String display(Model model)
	{
		model.addAttribute("message", "Spring Boot is awsome in SecondApp");
		return "index";
		
	}
	@GetMapping
	public String display1(Model model)
	{
		model.addAttribute("message", "Spring Boot is");
		return "index";
		
	}
	@PostMapping("/boot")
	public String display2(Model model)
	{
		model.addAttribute("message", "Spring Boot post mapping");
		return "index";
		
	}
	
	@PostMapping
	public String display3(Model model)
	{
		model.addAttribute("message", "Spring Boot post mapping");
		return "index";
		
	}
}
