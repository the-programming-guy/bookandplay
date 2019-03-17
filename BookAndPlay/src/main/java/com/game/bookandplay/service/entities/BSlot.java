package com.game.bookandplay.service.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the B_SLOT database table.
 * 
 */
@Entity
@Table(name="B_SLOT")
@NamedQuery(name="BSlot.findAll", query="SELECT b FROM BSlot b")
public class BSlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_SLOT_ID")
	private long bSlotId;

	private String available;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="SLOT_1")
	private String slot1;

	@Column(name="SLOT_10")
	private String slot10;

	@Column(name="SLOT_11")
	private String slot11;

	@Column(name="SLOT_12")
	private String slot12;

	@Column(name="SLOT_13")
	private String slot13;

	@Column(name="SLOT_14")
	private String slot14;

	@Column(name="SLOT_15")
	private String slot15;

	@Column(name="SLOT_16")
	private String slot16;

	@Column(name="SLOT_17")
	private String slot17;

	@Column(name="SLOT_18")
	private String slot18;

	@Column(name="SLOT_19")
	private String slot19;

	@Column(name="SLOT_2")
	private String slot2;

	@Column(name="SLOT_20")
	private String slot20;

	@Column(name="SLOT_21")
	private String slot21;

	@Column(name="SLOT_22")
	private String slot22;

	@Column(name="SLOT_23")
	private String slot23;

	@Column(name="SLOT_24")
	private String slot24;

	@Column(name="SLOT_3")
	private String slot3;

	@Column(name="SLOT_4")
	private String slot4;

	@Column(name="SLOT_5")
	private String slot5;

	@Column(name="SLOT_6")
	private String slot6;

	@Column(name="SLOT_7")
	private String slot7;

	@Column(name="SLOT_8")
	private String slot8;

	@Column(name="SLOT_9")
	private String slot9;

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

	public BSlot() {
	}

	public long getBSlotId() {
		return this.bSlotId;
	}

	public void setBSlotId(long bSlotId) {
		this.bSlotId = bSlotId;
	}

	public String getAvailable() {
		return this.available;
	}

	public void setAvailable(String available) {
		this.available = available;
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

	public String getSlot1() {
		return this.slot1;
	}

	public void setSlot1(String slot1) {
		this.slot1 = slot1;
	}

	public String getSlot10() {
		return this.slot10;
	}

	public void setSlot10(String slot10) {
		this.slot10 = slot10;
	}

	public String getSlot11() {
		return this.slot11;
	}

	public void setSlot11(String slot11) {
		this.slot11 = slot11;
	}

	public String getSlot12() {
		return this.slot12;
	}

	public void setSlot12(String slot12) {
		this.slot12 = slot12;
	}

	public String getSlot13() {
		return this.slot13;
	}

	public void setSlot13(String slot13) {
		this.slot13 = slot13;
	}

	public String getSlot14() {
		return this.slot14;
	}

	public void setSlot14(String slot14) {
		this.slot14 = slot14;
	}

	public String getSlot15() {
		return this.slot15;
	}

	public void setSlot15(String slot15) {
		this.slot15 = slot15;
	}

	public String getSlot16() {
		return this.slot16;
	}

	public void setSlot16(String slot16) {
		this.slot16 = slot16;
	}

	public String getSlot17() {
		return this.slot17;
	}

	public void setSlot17(String slot17) {
		this.slot17 = slot17;
	}

	public String getSlot18() {
		return this.slot18;
	}

	public void setSlot18(String slot18) {
		this.slot18 = slot18;
	}

	public String getSlot19() {
		return this.slot19;
	}

	public void setSlot19(String slot19) {
		this.slot19 = slot19;
	}

	public String getSlot2() {
		return this.slot2;
	}

	public void setSlot2(String slot2) {
		this.slot2 = slot2;
	}

	public String getSlot20() {
		return this.slot20;
	}

	public void setSlot20(String slot20) {
		this.slot20 = slot20;
	}

	public String getSlot21() {
		return this.slot21;
	}

	public void setSlot21(String slot21) {
		this.slot21 = slot21;
	}

	public String getSlot22() {
		return this.slot22;
	}

	public void setSlot22(String slot22) {
		this.slot22 = slot22;
	}

	public String getSlot23() {
		return this.slot23;
	}

	public void setSlot23(String slot23) {
		this.slot23 = slot23;
	}

	public String getSlot24() {
		return this.slot24;
	}

	public void setSlot24(String slot24) {
		this.slot24 = slot24;
	}

	public String getSlot3() {
		return this.slot3;
	}

	public void setSlot3(String slot3) {
		this.slot3 = slot3;
	}

	public String getSlot4() {
		return this.slot4;
	}

	public void setSlot4(String slot4) {
		this.slot4 = slot4;
	}

	public String getSlot5() {
		return this.slot5;
	}

	public void setSlot5(String slot5) {
		this.slot5 = slot5;
	}

	public String getSlot6() {
		return this.slot6;
	}

	public void setSlot6(String slot6) {
		this.slot6 = slot6;
	}

	public String getSlot7() {
		return this.slot7;
	}

	public void setSlot7(String slot7) {
		this.slot7 = slot7;
	}

	public String getSlot8() {
		return this.slot8;
	}

	public void setSlot8(String slot8) {
		this.slot8 = slot8;
	}

	public String getSlot9() {
		return this.slot9;
	}

	public void setSlot9(String slot9) {
		this.slot9 = slot9;
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

}