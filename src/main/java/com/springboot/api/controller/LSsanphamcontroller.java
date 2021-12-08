package com.springboot.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.LSChiTietDonHang;
import com.springboot.api.service.LSsanphamservice;

@RestController
@RequestMapping("/sanpham")

public class LSsanphamcontroller {
	@Autowired //sẽ tự động inject bean tương ứng vào vị trí được đánh dấu
	private LSsanphamservice service;
	@GetMapping("/listar")//xử lý hàm bằng phương thức get
	public List<Map<String, Object>> listar(Model model) {
		return service.listar();
	}
	
}
