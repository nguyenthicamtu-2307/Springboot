package com.springboot.api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Khuyenmai")
public class Khuyenmai {

	private String idkm;
	private String idkh;
	private String tenkm;
	private int giatrikm;

	private Date thoigianbatdau;
	private Date thoigianketthuc;
	private String chitietkm;
	public Khuyenmai() {
	}
	
	public Khuyenmai(String idkm,String idkh, String tenkm, int giatrikm, Date thoigianbatdau, Date thoigianketthuc,
			String chitietkm) {
		super();
		this.idkm = idkm;
		this.idkh = idkh;
		this.tenkm = tenkm;
		this.giatrikm = giatrikm;
		this.thoigianbatdau = thoigianbatdau;
		this.thoigianketthuc = thoigianketthuc;
		this.chitietkm = chitietkm;
	}
	@Id
	
	@Column(name = "idkm", nullable = false)
	public String getIdkm() {
		return idkm;
	}
	

	public void setIdkm(String idkm) {
		this.idkm = idkm;
	}
	@Column(name = "idkh", nullable = false)
	public String getIdkh() {
		return idkh;
	}

	public void setIdkh(String idkh) {
		this.idkh = idkh;
	}
	@Column(name = "tenkm", nullable = false)
	public String getTenkm() {
		return tenkm;
	}

	public void setTenkm(String tenkm) {
		this.tenkm = tenkm;
	}
	@Column(name = "giatrikm", nullable = false)
	public int getGiatrikm() {
		return giatrikm;
	}

	public void setGiatrikm(int giatrikm) {
		this.giatrikm = giatrikm;
	}
	@Column(name = "thoigianbatdau", nullable = false)
	public Date getThoigianbatdau() {
		return thoigianbatdau;
	}

	public void setThoigianbatdau(Date thoigianbatdau) {
		this.thoigianbatdau = thoigianbatdau;
	}
	@Column(name = "thoigianketthuc", nullable = false)
	public Date getThoigianketthuc() {
		return thoigianketthuc;
	}

	public void setThoigianketthuc(Date thoigianketthuc) {
		this.thoigianketthuc = thoigianketthuc;
	}
	@Column(name = "chitietkm", nullable = false)
	public String getChitietkm() {
		return chitietkm;
	}

	public void setChitietkm(String chitietkm) {
		this.chitietkm = chitietkm;
	}

	
	
	
	
}