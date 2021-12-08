package com.springboot.api.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springboot.api.interfaces.KhachHangInterface;
import com.springboot.api.model.KhachHang;
@Service
@Repository
public class KhachHangDao implements KhachHangInterface {
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = template.queryForList("select * from khachhang");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(KhachHang p) {
		// TODO Auto-generated method stub
		String sql="insert into khachhang(tendn,matkhau,sdt) values(?,?,?)";
		return template.update(p.getTendn(),p.getMatkhau(),p.getSdt());
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
