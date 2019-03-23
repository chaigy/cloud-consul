package com.cgy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	@Autowired
	private RestTemplate rest;
	
	@GetMapping("/get")
	public String get() {
		String url="http://cgy-member/member/";
	String ret = rest.getForObject(url, String.class);
	 return ret;	
	}
}
