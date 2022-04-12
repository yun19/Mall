package com.vam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	@RequestMapping(value="/MainP", method = RequestMethod.GET)
	public String create_Get(){
		return "MainP";
}
	@GetMapping("/create")
	public String Create() {
		return "create";
	}
	@GetMapping("/book_add")
	public String Book_Add() {
		return "book_add";
	}
	
}

