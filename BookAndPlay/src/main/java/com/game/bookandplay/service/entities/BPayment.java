package com.game.bookandplay.service.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the B_PAYMENT database table.
 * 
 */
@Entity
@Table(name="B_PAYMENT")
@NamedQuery(name="BPayment.findAll", query="SELECT b FROM BPayment b")
public class BPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_PAYMENT_ID")
	private long bPaymentId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	private String gateway;

	@Column(name="\"HOURS\"")
	private BigDecimal hours;

	@Column(name="STATUS_CD")
	private String statusCd;

	@Column(name="TOTAL_AMOUNT")
	private BigDecimal totalAmount;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to BBooking
	@ManyToOne
	@JoinColumn(name="B_BOOKING_ID")
	private BBooking BBooking;

	public BPayment() {
	}

	public long getBPaymentId() {
		return this.bPaymentId;
	}

	public void setBPaymentId(long bPaymentId) {
		this.bPaymentId = bPaymentId;
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

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public BigDecimal getHours() {
		return this.hours;
	}

	public void setHours(BigDecimal hours) {
		this.hours = hours;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
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

	public BBooking getBBooking() {
		return this.BBooking;
	}

	public void setBBooking(BBooking BBooking) {
		this.BBooking = BBooking;
	}

}