package com.springboot.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.DAO.KhachHangDao;
import com.springboot.api.interfaces.KhachHangInterface;
import com.springboot.api.model.KhachHang;
@Service
public class KhachHangService implements KhachHangInterface {
	@Autowired
		KhachHangDao dao;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(KhachHang p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(KhachHang p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
