package com.game.bookandplay.service.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the B_GAME database table.
 * 
 */
@Entity
@Table(name="B_GAME")
@NamedQuery(name="BGame.findAll", query="SELECT b FROM BGame b")
public class BGame implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_GAME_ID")
	private long bGameId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	private String location;

	@Column(name="NAME_OF_GAME")
	private String nameOfGame;

	@Column(name="ORGANIZATION_NAME")
	private String organizationName;

	@Column(name="STATUS_CD")
	private String statusCd;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to BBooking
	@OneToMany(mappedBy="BGame")
	private List<BBooking> BBookings;

	//bi-directional many-to-one association to BSlot
	@OneToMany(mappedBy="BGame")
	private List<BSlot> BSlots;

	public BGame() {
	}

	public long getBGameId() {
		return this.bGameId;
	}

	public void setBGameId(long bGameId) {
		this.bGameId = bGameId;
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNameOfGame() {
		return this.nameOfGame;
	}

	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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

	public List<BBooking> getBBookings() {
		return this.BBookings;
	}

	public void setBBookings(List<BBooking> BBookings) {
		this.BBookings = BBookings;
	}

	public BBooking addBBooking(BBooking BBooking) {
		getBBookings().add(BBooking);
		BBooking.setBGame(this);

		return BBooking;
	}

	public BBooking removeBBooking(BBooking BBooking) {
		getBBookings().remove(BBooking);
		BBooking.setBGame(null);

		return BBooking;
	}

	public List<BSlot> getBSlots() {
		return this.BSlots;
	}

	public void setBSlots(List<BSlot> BSlots) {
		this.BSlots = BSlots;
	}

	public BSlot addBSlot(BSlot BSlot) {
		getBSlots().add(BSlot);
		BSlot.setBGame(this);

		return BSlot;
	}

	public BSlot removeBSlot(BSlot BSlot) {
		getBSlots().remove(BSlot);
		BSlot.setBGame(null);

		return BSlot;
	}

}