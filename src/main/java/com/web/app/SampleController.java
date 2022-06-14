package com.web.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class SampleController {

	@GetMapping("/say")
	public String sayhello() {
		return "Welcome to GITHub";

	}

	@GetMapping("/hi")
	public String say() {
		return "welcome";
	}
}
