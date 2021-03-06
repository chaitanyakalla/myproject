package com.zen.smi.dao;

import java.io.Serializable;

import com.zen.smi.dao.entities.Users;
import com.zen.smi.dao.exception.GenericDAOException;

public interface UsersDAO extends BaseDAO<Users, Serializable> {

	Users getUserByUserName(String userName) throws GenericDAOException;
	
	Users authenticate(String userName, String password) throws GenericDAOException;

	void  createUser(Users user)throws GenericDAOException;

}
