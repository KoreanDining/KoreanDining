package com.test.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.food.dao.MenuOrderDAO;

@Service
public class MenuOrderService {

	@Autowired
	private MenuOrderDAO dao;
}
