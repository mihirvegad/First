package com.codersfarm.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class V {
	@GetMapping("/login")
	public String v() {
	return "login";
}
	
}
