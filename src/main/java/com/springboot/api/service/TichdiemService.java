package com.springboot.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.DAO.TichdiemDao;
import com.springboot.api.interfaces.TichdiemInterface;


@Service
public class TichdiemService implements TichdiemInterface  {
	@Autowired
	TichdiemDao dao;

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
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
