package com.ucs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ucs.factory.OrdinaryUserFactory;
import com.ucs.model.OrdinaryUser;
import com.ucs.service.IOrdinaryUserRegistService;

@Controller
public class TestController {
	@Autowired
	private OrdinaryUserRegistController ordinaryUserRegistController;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void Test() {
		//InsertTestData();
	}
	
	public void InsertTestData() {
		ordinaryUserRegistController.userRegist("superAdmin", "123123", "123123");
		ordinaryUserRegistController.userRegist("advancedAdmin", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalAdmin", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser1", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser2", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser3", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser4", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser5", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser6", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser7", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser8", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser9", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser10", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser11", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser12", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser13", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser14", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser15", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser16", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser17", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser18", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser19", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser20", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser21", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser22", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser23", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser24", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser25", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser26", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser27", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser28", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser29", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser30", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser31", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser32", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser33", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser34", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser35", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser36", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser37", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser38", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser39", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser40", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser41", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser42", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser43", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser44", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser45", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser46", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser47", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser48", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser49", "123123", "123123");
		ordinaryUserRegistController.userRegist("normalUser50", "123123", "123123");
	}
}
