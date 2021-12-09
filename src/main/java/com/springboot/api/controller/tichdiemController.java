package com.springboot.api.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.service.TichdiemService;





@RestController
@RequestMapping("/Tichdiem")
public class tichdiemController {
	@Autowired
	private TichdiemService service;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar(Model model) {
		return service.listar();
	}


	
}
