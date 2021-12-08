package com.springboot.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="KhachHang")
@Entity
public class KhachHang {
	@Id
	@Column
	private String idkh;
	@Column
	private String tenkh;
	@Column
	private int sdt;
	@Column
	private String diachi;
	@Column
	private Date ngaysinh;
	@Column
	private String gioitinh;
	@Column
	private String hinhanhkh;
	@Column
	private String tendn;
	@Column
	private int matkhau;
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	public String getIdkh() {
		return idkh;
	}
	public void setIdkh(String idkh) {
		this.idkh = idkh;
	}
	public String getTenkh() {
		return tenkh;
	}
	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getHinhanhkh() {
		return hinhanhkh;
	}
	public void setHinhanhkh(String hinhanhkh) {
		this.hinhanhkh = hinhanhkh;
	}
	public String getTendn() {
		return tendn;
	}
	public void setTendn(String tendn) {
		this.tendn = tendn;
	}
	public int getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(int matkhau) {
		this.matkhau = matkhau;
	}
	
}
