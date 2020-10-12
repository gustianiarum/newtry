package com.rumi.tryapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rumi.tryapp.model.Dto;

@RestController
@RequestMapping("/hai")
public class Controller {
	
	@GetMapping
	public Dto get() {
		Dto data=new Dto();
		data.setMessage("success");
		return data;
	}

}
