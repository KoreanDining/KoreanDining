package com.test.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.food.dao.KfMemberDAO;

@Service
public class KfMemberService {

	@Autowired
	private KfMemberDAO dao;
}
