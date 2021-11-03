package com.test.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.food.dao.QuestionListDAO;

@Service
public class QuestionListService {

	@Autowired
	private QuestionListDAO dao;
}
