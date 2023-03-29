package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testRequestHeader")
public class RequestHeader {
	@GetMapping(path = "/heeder")
	public String getHeader(@org.springframework.web.bind.annotation.RequestHeader("my-Header") String myHeader) {
		return "your header is: " + myHeader;
	}
}
