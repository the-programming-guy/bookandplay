package com.game.bookandplay.service.dto;

public class UserDetailsDTO {

	private String username, firstname, lastname, emailId, gender;
	private Long mobile;

	public UserDetailsDTO(String username, String firstname, String lastname, String emailId, String gender,
			Long mobile) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
		this.gender = gender;
		this.mobile = mobile;
	}
	
	public UserDetailsDTO() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "UserDetailsDTO [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailId=" + emailId + ", gender=" + gender + ", mobile=" + mobile + "]";
	}

}
