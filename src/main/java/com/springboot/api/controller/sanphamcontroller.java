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

import com.springboot.api.model.sanpham;
import com.springboot.api.service.sanphamservice;

@RestController
@RequestMapping("/sanpham")

public class sanphamcontroller {
	@Autowired //sẽ tự động inject bean tương ứng vào vị trí được đánh dấu
	private sanphamservice service;
	@GetMapping("/listar")//xử lý hàm bằng phương thức get
	public List<Map<String, Object>> listar(Model model) {
		return service.listar();
	}
	@PostMapping("/insert")
	public String save(@RequestBody sanpham p,Model model) {
		int idsp=service.add(p);
		if(idsp==0) {
			return "thêm không thành công";
		}
		return "Đã thêm thành công";
		
	}
	@PostMapping("/update/{idsp}")//xử  lý hàm bằng phương thức post
	public String save(@RequestBody sanpham p,@PathVariable int id,Model model) {
		p.setIdsp(id);
		int r=service.edit(p);
		if(r==0) {
			return "Không thể cập nhật";
		}
		return "câp nhật thành công";
		
	}
	@PostMapping("/delete/{idsp}")
	public String delete(@PathVariable int p,Model model) {
		int r=service.delete(p);
		if(r==0) {
			return "Xóa không thành công";
		}
		return "Đã xóa thành công";
	}
	@GetMapping("/listts")
	public List<Map<String, Object>> listts(Model model) {
		return service.getts();
	}
	@GetMapping("/listbm")
	public List<Map<String, Object>> listbm(Model model) {
		return service.getbm();
	}
	@GetMapping("/listcf")
	public List<Map<String, Object>> listcf(Model model) {
		return service.getcf();
	}
	@GetMapping("/listbsn")
	public List<Map<String, Object>> listbsn(Model model) {
		return service.getbsn();
	}
	@GetMapping("/dexuat")
	public List<Map<String, Object>> listdexuat(Model model) {
		return service.getdexuat();
	}
}
