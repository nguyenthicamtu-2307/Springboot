package com.springboot.api.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springboot.api.interfaces.TichdiemInterface;


@Service
@Repository
public class TichdiemDao implements TichdiemInterface {
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from tichdiem");
		return list;
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
