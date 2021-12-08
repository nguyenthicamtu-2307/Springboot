package com.springboot.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.springboot.api.DAO.LSSanphamDao;
import com.springboot.api.interfaces.LSSanphamInterface;
import com.springboot.api.model.LSChiTietDonHang;
@Service
public class LSsanphamservice implements LSSanphamInterface{
	@Autowired
	LSSanphamDao dao;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}


}
