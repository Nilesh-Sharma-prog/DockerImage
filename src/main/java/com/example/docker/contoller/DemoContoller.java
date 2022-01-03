package com.example.docker.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Demo")
public class DemoContoller {
	@RequestMapping(path="/getTest")
	public String m2() {
		return new String("Hellow ordl");
	}
}
