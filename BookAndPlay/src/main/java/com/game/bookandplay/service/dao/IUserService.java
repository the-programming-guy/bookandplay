package com.game.bookandplay.service.dao;

import java.util.List;

import com.game.bookandplay.service.entities.BUser;

public interface IUserService {
	List<BUser> getAvailablegames() throws Exception;
}
