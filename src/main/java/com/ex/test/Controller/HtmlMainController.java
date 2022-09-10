package com.ex.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlMainController {
	@RequestMapping("/indext")
	public String Html()
	{
		return "indext";
	}

}
