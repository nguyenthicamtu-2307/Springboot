package com.springboot.api.interfaces;

import java.util.List;
import java.util.Map;

import com.springboot.api.model.KhachHang;



public interface KhachHangInterface {
	public  List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(KhachHang p);
	public int edit(KhachHang p);
	public int delete(int id);
}
