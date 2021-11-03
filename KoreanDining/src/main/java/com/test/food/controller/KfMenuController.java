package com.test.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.food.service.KfMenuService;

@Controller
public class KfMenuController {

	@Autowired
	private KfMenuService service;
}
