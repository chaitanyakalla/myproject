package com.zen.smi.service;

import com.zen.smi.bo.UserBO;
import com.zen.smi.exception.BusinessException;
import com.zen.smi.exception.UserException;

public interface UserService {

	
	UserBO getUserByUserName(String userName) throws BusinessException;
	
	
	UserBO authenticate(String userName, String password) throws BusinessException;
	
	
	
	String createUser(UserBO userBO) throws BusinessException;
	
	
}
