package com.game.bookandplay.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.game.bookandplay.service.dto.UserDetailsDTO;
import com.game.bookandplay.service.entities.BUser;
import com.game.bookandplay.service.impl.UserService;

@Controller
@RequestMapping("bookmyplay")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping("/getAvailableGames")
	public ResponseEntity<List<UserDetailsDTO>> getAvailablegames() throws Exception {
		List<UserDetailsDTO> users = populateUserDetails(service.getAvailablegames());
		return new ResponseEntity<List<UserDetailsDTO>>(users, HttpStatus.OK);
	}

	private List<UserDetailsDTO> populateUserDetails(List<BUser> userList) {
		List<UserDetailsDTO> users = new ArrayList<>();
		for (BUser user : userList) {
			UserDetailsDTO dto = new UserDetailsDTO();
			dto.setEmailId(user.getBUserDetails().get(0).getEmail());
			dto.setFirstname(user.getBUserDetails().get(0).getFirstname());
			dto.setGender(user.getBUserDetails().get(0).getGender());
			dto.setLastname(user.getBUserDetails().get(0).getLastname());
			dto.setMobile(Long.valueOf(user.getBUserDetails().get(0).getMobile()+""));
			dto.setUsername(user.getUsername());
			users.add(dto);
		}	
		return users;
	}

}
