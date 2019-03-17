package com.game.bookandplay.service.dao;

import java.util.List;

import com.game.bookandplay.service.entities.BUser;

public interface IUserDAO {

	List<BUser> getAvailablegames() throws Exception;

}
