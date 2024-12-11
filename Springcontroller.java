package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Springcontroller {
	@GetMapping
	public String getHelloworld(){
		return "hello world";
		
	}//localhost:8080/search?q//
	@GetMapping("search")
	public String gethelloworld(@RequestParam(name="q")String value) {
		return "hello";
	}// /search/kartik//
	@GetMapping("search/{kartik}")
	public int value(@PathVariable(name="kartik")String value) {
		return 100;
	}
	//localhost:8080/port  //
	@PostMapping(path="port")
	public String register() {
		return "register";
	}

}
