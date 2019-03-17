package com.game.bookandplay.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.bookandplay.service.dao.IUserDAO;
import com.game.bookandplay.service.entities.BUser;

@Transactional
@Repository
public class UserDAO implements IUserDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<BUser> getAvailablegames() throws Exception {
		return entityManager.createQuery("from BUser").getResultList();
	}

}
