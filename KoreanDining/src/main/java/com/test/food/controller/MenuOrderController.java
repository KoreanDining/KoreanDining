package com.test.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.food.service.MenuOrderService;

@Controller
public class MenuOrderController {

	@Autowired
	private MenuOrderService service;
}

