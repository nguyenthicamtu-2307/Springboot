package com.springboot.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "khachhang")
public class LSKhachHang implements Serializable {
	@Id
	@Column(name = "idkh")
	private String idkh;
	
	@Column(name = "tenkh")
	private String tenkh;
	
	@OneToMany(mappedBy = "kh")
	private List<LSDonHang> dh2;
}
