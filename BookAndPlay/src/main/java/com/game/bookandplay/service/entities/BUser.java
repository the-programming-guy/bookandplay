package com.game.bookandplay.service.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the B_USERS database table.
 * 
 */
@Entity
@Table(name="B_USERS")
@NamedQuery(name="BUser.findAll", query="SELECT b FROM BUser b")
public class BUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_USERS_ID")
	private long bUsersId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="STATUS_CD")
	private String statusCd;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	private String username;

	//bi-directional many-to-one association to BBooking
	@OneToMany(mappedBy="BUser")
	private List<BBooking> BBookings;

	//bi-directional many-to-one association to BUserDetail
	@OneToMany(mappedBy="BUser")
	private List<BUserDetail> BUserDetails;

	public BUser() {
	}

	public long getBUsersId() {
		return this.bUsersId;
	}

	public void setBUsersId(long bUsersId) {
		this.bUsersId = bUsersId;
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

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<BBooking> getBBookings() {
		return this.BBookings;
	}

	public void setBBookings(List<BBooking> BBookings) {
		this.BBookings = BBookings;
	}

	public BBooking addBBooking(BBooking BBooking) {
		getBBookings().add(BBooking);
		BBooking.setBUser(this);

		return BBooking;
	}

	public BBooking removeBBooking(BBooking BBooking) {
		getBBookings().remove(BBooking);
		BBooking.setBUser(null);

		return BBooking;
	}

	public List<BUserDetail> getBUserDetails() {
		return this.BUserDetails;
	}

	public void setBUserDetails(List<BUserDetail> BUserDetails) {
		this.BUserDetails = BUserDetails;
	}

	public BUserDetail addBUserDetail(BUserDetail BUserDetail) {
		getBUserDetails().add(BUserDetail);
		BUserDetail.setBUser(this);

		return BUserDetail;
	}

	public BUserDetail removeBUserDetail(BUserDetail BUserDetail) {
		getBUserDetails().remove(BUserDetail);
		BUserDetail.setBUser(null);

		return BUserDetail;
	}

}