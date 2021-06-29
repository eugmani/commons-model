package com.eu.microservicios.commons.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
abstract class CommonTable {
	
	// Parametros de auditoria
//	@NotNull
	@Column(name = "create_user_id")
	@JsonIgnore
	private Long createUserId;
	
//	@NotNull
	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	private Date createDate;
	
//	@NotNull
	@Column(name = "update_user_id")
	@JsonIgnore
	private Long updateUserId;

//	@NotNull
	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	private Date updateDate;

//	@NotNull
	@JsonIgnore
	private Boolean deleted;
	
	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Long getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
}
