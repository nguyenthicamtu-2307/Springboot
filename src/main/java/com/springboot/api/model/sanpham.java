package com.springboot.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//khai báo bảng và thực thể
@Table(name="sanpham")
@Entity
public class sanpham {
	//khai báo các cột có trong  bảng
	@Id
	@Column
	private int idsp;
	@Column
	private String tensp;
	@Column
	private int soluong;
	@Column
	private int giasp;
	@Column
	private String chitiet;
	@Column
	private int hinhanh;
	@Column
	private String iddm;
	@Column
	private String idkm;
	public sanpham() {
		// TODO Auto-generated constructor stub
	}
	public int getIdsp() {
		return idsp;
	}
	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGiasp() {
		return giasp;
	}
	public void setGiasp(int giasp) {
		this.giasp = giasp;
	}
	public String getChitiet() {
		return chitiet;
	}
	public void setChitiet(String chitiet) {
		this.chitiet = chitiet;
	}
	public int getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(int hinhanh) {
		this.hinhanh = hinhanh;
	}
	public String getIddm() {
		return iddm;
	}
	public void setIddm(String iddm) {
		this.iddm = iddm;
	}
	public String getIdkm() {
		return idkm;
	}
	public void setIdkm(String idkm) {
		this.idkm = idkm;
	}
	
	
}
