package com.springboot.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.springboot.api.DAO.SanphamDao;
import com.springboot.api.interfaces.SanphamInterface;
import com.springboot.api.model.sanpham;
@Service
public class sanphamservice implements SanphamInterface{
	@Autowired
	SanphamDao dao;
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
	public int add(sanpham p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(sanpham p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<Map<String, Object>> getts() {
		// TODO Auto-generated method stub
		return dao.getts();
	}

	@Override
	public List<Map<String, Object>> getbm() {
		// TODO Auto-generated method stub
		return dao.getbm();
	}

	@Override
	public List<Map<String, Object>> getcf() {
		// TODO Auto-generated method stub
		return dao.getcf();
	}

	@Override
	public List<Map<String, Object>> getbsn() {
		// TODO Auto-generated method stub
		return dao.getbsn();
	}

	@Override
	public List<Map<String, Object>> getdexuat() {
		// TODO Auto-generated method stub
		return dao.getdexuat();
	}

	@Override
	public List<Map<String, Object>> timkiem() {
		// TODO Auto-generated method stub
		return null;
	}

}
