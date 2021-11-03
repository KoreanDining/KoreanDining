package com.test.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.food.service.KfMemberService;

@Controller
public class KfMemberController {

	@Autowired
	private KfMemberService service;
}
