package com.springboot.api.interfaces;
import java.util.List;
import java.util.Map;

public interface KhuyenmaiInterface {
	public  List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int delete(int id);
}
