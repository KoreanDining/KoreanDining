package com.test.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.food.dao.KfMenuDAO;

@Service
public class KfMenuService {

	@Autowired
	private KfMenuDAO dao;
}
