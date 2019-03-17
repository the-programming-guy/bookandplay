package com.game.bookandplay.service.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the B_BOOKING database table.
 * 
 */
@Entity
@Table(name="B_BOOKING")
@NamedQuery(name="BBooking.findAll", query="SELECT b FROM BBooking b")
public class BBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_BOOKING_ID")
	private long bBookingId;

	@Column(name="BOOKED_SLOTS")
	private String bookedSlots;

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

	//bi-directional many-to-one association to BGame
	@ManyToOne
	@JoinColumn(name="B_GAME_ID")
	private BGame BGame;

	//bi-directional many-to-one association to BUser
	@ManyToOne
	@JoinColumn(name="B_USERS_ID")
	private BUser BUser;

	//bi-directional many-to-one association to BPayment
	@OneToMany(mappedBy="BBooking")
	private List<BPayment> BPayments;

	public BBooking() {
	}

	public long getBBookingId() {
		return this.bBookingId;
	}

	public void setBBookingId(long bBookingId) {
		this.bBookingId = bBookingId;
	}

	public String getBookedSlots() {
		return this.bookedSlots;
	}

	public void setBookedSlots(String bookedSlots) {
		this.bookedSlots = bookedSlots;
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

	public BGame getBGame() {
		return this.BGame;
	}

	public void setBGame(BGame BGame) {
		this.BGame = BGame;
	}

	public BUser getBUser() {
		return this.BUser;
	}

	public void setBUser(BUser BUser) {
		this.BUser = BUser;
	}

	public List<BPayment> getBPayments() {
		return this.BPayments;
	}

	public void setBPayments(List<BPayment> BPayments) {
		this.BPayments = BPayments;
	}

	public BPayment addBPayment(BPayment BPayment) {
		getBPayments().add(BPayment);
		BPayment.setBBooking(this);

		return BPayment;
	}

	public BPayment removeBPayment(BPayment BPayment) {
		getBPayments().remove(BPayment);
		BPayment.setBBooking(null);

		return BPayment;
	}

}