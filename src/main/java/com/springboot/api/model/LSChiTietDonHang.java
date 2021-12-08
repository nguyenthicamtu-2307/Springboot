package com.springboot.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//khai báo bảng và thực thể
@Table(name="chitietdonhang")
@Entity
public class LSChiTietDonHang implements Serializable {
	@Id
	@Column(name = "iddh1")
	private String iddh;
	@Column(name = "idsp1")
	private String idsp;
	
	@Column(name = "soluong")
	private int soLuong;
	
	@Column(name = "dongia")
	private double donGia;

	@ManyToOne
	@JoinColumn(name = "iddh")
	private LSDonHang dh;
	
	@ManyToOne
	@JoinColumn(name = "idsp")
	private LSSanPham sp;
	
}
