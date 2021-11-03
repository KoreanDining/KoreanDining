package com.test.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.food.service.QuestionListService;

@Controller
public class QuestionListController {

	@Autowired
	private QuestionListService	service;
}
