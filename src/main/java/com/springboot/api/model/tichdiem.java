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
@Table(name = "tichdiem")
public class tichdiem {
	private String idtd;
	private String idkh;
	private String iddh;
	private int sodiem;

	private Date ngaytd;
	public tichdiem() {
	}
	public tichdiem(String idtd, String idkh, String iddh, int sodiem, Date ngaytd) {
		super();
		this.idtd = idtd;
		this.idkh = idkh;
		this.iddh = iddh;
		this.sodiem = sodiem;
		this.ngaytd = ngaytd;
	}
	@Id
	@Column(name = "idtd", nullable = false)
	public String getIdtd() {
		return idtd;
	}

	public void setIdtd(String idtd) {
		this.idtd = idtd;
	}
	
	@Column(name = "idkh", nullable = false)
	public String getIdkh() {
		return idkh;
	}

	public void setIdkh(String idkh) {
		this.idkh = idkh;
	}
	@Column(name = "iddh", nullable = false)
	public String getIddh() {
		return iddh;
	}

	public void setIddh(String iddh) {
		this.iddh = iddh;
	}
	@Column(name = "sodiem", nullable = false)
	public int getSodiem() {
		return sodiem;
	}

	public void setSodiem(int sodiem) {
		this.sodiem = sodiem;
	}
	@Column(name = "ngaytd", nullable = false)
	public Date getNgaytd() {
		return ngaytd;
	}

	public void setNgaytd(Date ngaytd) {
		this.ngaytd = ngaytd;
	}
	

}
