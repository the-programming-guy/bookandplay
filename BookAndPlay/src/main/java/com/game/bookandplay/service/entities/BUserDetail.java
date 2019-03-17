package com.game.bookandplay.service.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the B_USER_DETAILS database table.
 * 
 */
@Entity
@Table(name="B_USER_DETAILS")
@NamedQuery(name="BUserDetail.findAll", query="SELECT b FROM BUserDetail b")
public class BUserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_USER_DETAILS_ID")
	private long bUserDetailsId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	private String email;

	private String firstname;

	private String gender;

	private String lastname;

	private BigDecimal mobile;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to BUser
	@ManyToOne
	@JoinColumn(name="B_USERS_ID")
	private BUser BUser;

	public BUserDetail() {
	}

	public long getBUserDetailsId() {
		return this.bUserDetailsId;
	}

	public void setBUserDetailsId(long bUserDetailsId) {
		this.bUserDetailsId = bUserDetailsId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BigDecimal getMobile() {
		return this.mobile;
	}

	public void setMobile(BigDecimal mobile) {
		this.mobile = mobile;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public BUser getBUser() {
		return this.BUser;
	}

	public void setBUser(BUser BUser) {
		this.BUser = BUser;
	}

}