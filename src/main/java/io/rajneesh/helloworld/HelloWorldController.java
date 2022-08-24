package io.rajneesh.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/world")
	public String getHelloWorld() {
		return "Hello World";
	}
}
