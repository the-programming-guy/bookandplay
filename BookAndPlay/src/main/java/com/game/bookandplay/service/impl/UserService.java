package com.game.bookandplay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.bookandplay.service.dao.IUserDAO;
import com.game.bookandplay.service.entities.BUser;

@Service
public class UserService implements IUserDAO {

	@Autowired
	UserDAO user;

	@Override
	public List<BUser> getAvailablegames() throws Exception {
		return user.getAvailablegames();
	}

}
