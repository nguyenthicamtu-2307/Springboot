package com.springboot.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.KhachHang;
import com.springboot.api.model.sanpham;
import com.springboot.api.service.KhachHangService;

@RestController
@RequestMapping("/khachhang")
public class KhachHangController {
	@Autowired
	private KhachHangService service;
	@GetMapping("/listar")//xử lý hàm bằng phương thức get
	public List<Map<String, Object>> listar(Model model) {
		return service.listar();
	}
	@PostMapping("/insert")
	public String save(@RequestBody KhachHang p,Model model) {
		int idkh=service.add(p);
		if(idkh==0) {
			return "thêm không thành công";
		}
		return "Đã thêm thành công";
		
}}
