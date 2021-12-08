package com.springboot.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sanpham")
public class LSSanPham implements Serializable {
	@Id
	@Column(name = "idsp")
	private String idsp;
	
	@Column(name = "tensp")
	private String tenSP;
	@Column(name = "giasp")
	private double giaSP;
	@Column(name = "hinhanh")
	private String hinhAnh;
	
	@OneToMany(mappedBy="sp")
	private List<LSChiTietDonHang> ctdh2;
}
