package com.game.bookandplay.service.entities;
// Generated 14 Mar, 2019 10:09:46 PM by Hibernate Tools 5.3.0.Beta2

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BUsers generated by hbm2java
 */
public class BUsers implements java.io.Serializable {

	private BigDecimal BUsersId;
	private BStatus BStatus;
	private String username;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private Set BBookings = new HashSet(0);
	private Set BUserDetailses = new HashSet(0);

	public BUsers() {
	}

	public BUsers(BigDecimal BUsersId) {
		this.BUsersId = BUsersId;
	}

	public BUsers(BigDecimal BUsersId, BStatus BStatus, String username, Date createdDate, String createdBy,
			Date updatedDate, String updatedBy, Set BBookings, Set BUserDetailses) {
		this.BUsersId = BUsersId;
		this.BStatus = BStatus;
		this.username = username;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.BBookings = BBookings;
		this.BUserDetailses = BUserDetailses;
	}

	public BigDecimal getBUsersId() {
		return this.BUsersId;
	}

	public void setBUsersId(BigDecimal BUsersId) {
		this.BUsersId = BUsersId;
	}

	public BStatus getBStatus() {
		return this.BStatus;
	}

	public void setBStatus(BStatus BStatus) {
		this.BStatus = BStatus;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Set getBBookings() {
		return this.BBookings;
	}

	public void setBBookings(Set BBookings) {
		this.BBookings = BBookings;
	}

	public Set getBUserDetailses() {
		return this.BUserDetailses;
	}

	public void setBUserDetailses(Set BUserDetailses) {
		this.BUserDetailses = BUserDetailses;
	}

}