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

@Entity
@Table(name="donhang")
public class LSDonHang implements Serializable {
	@Id
	@Column(name = "iddh")
	private String iddh;
	@Column(name = "ngaythanhtoan")
	private String ngayThanhToan;
	@Column(name = "diachi")
	private String diaChi;
	@Column(name = "tongtien")
	private double tongTien;
	@Column(name = "phivanchuyen")
	private double phiVanChuyen;
	@Column(name = "trangthaidonhang")
	private String trangThaiDonHang;

	@OneToMany(mappedBy="dh")
    private List<LSChiTietDonHang> ctdh1;

	@ManyToOne
	@JoinColumn(name = "idkh")
	private LSKhachHang kh;
	
}
