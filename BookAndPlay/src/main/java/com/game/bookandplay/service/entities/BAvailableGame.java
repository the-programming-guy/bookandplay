package com.game.bookandplay.service.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the B_AVAILABLE_GAMES database table.
 * 
 */
@Entity
@Table(name="B_AVAILABLE_GAMES")
@NamedQuery(name="BAvailableGame.findAll", query="SELECT b FROM BAvailableGame b")
public class BAvailableGame implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_AVAILABLE_GAMES_ID")
	private long bAvailableGamesId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="NAME_OF_GAME")
	private String nameOfGame;

	@Column(name="STATUS_CD")
	private String statusCd;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	public BAvailableGame() {
	}

	public long getBAvailableGamesId() {
		return this.bAvailableGamesId;
	}

	public void setBAvailableGamesId(long bAvailableGamesId) {
		this.bAvailableGamesId = bAvailableGamesId;
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

	public String getNameOfGame() {
		return this.nameOfGame;
	}

	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
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

}