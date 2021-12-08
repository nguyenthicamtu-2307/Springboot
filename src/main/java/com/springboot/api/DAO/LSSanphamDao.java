package com.springboot.api.DAO;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springboot.api.interfaces.LSSanphamInterface;
import com.springboot.api.model.LSChiTietDonHang;
@Service
@Repository
public class LSSanphamDao implements LSSanphamInterface{
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = template.queryForList("select dh.idkh,kh.tenkh, ctdh.iddh, dh.ngaythanhtoan, dh.diachi, dh.tongtien, dh.phivanchuyen, dh.trangthaidonhang, ctdh.idsp, ctdh.soluong, ctdh.dongia, sp.tensp, sp.giasp, sp.hinhanh  from khachhang kh, donhang dh, chitietdonhang ctdh, sanpham sp where dh.iddh = ctdh.iddh and ctdh.idsp = sp.idsp and kh.idkh = dh.idkh and dh.idkh = 'KH001'");
		return list;
	}



}
