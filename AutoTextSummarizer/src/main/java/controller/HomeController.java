package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HomeController {
	
	@RequestMapping(value= {"/","/home","/history"})
	public String home()
	{
		return "index";
	}
	
	@RequestMapping(value= {"/test"})
	public String test()
	{
		return "test";
	}
}
