package com.ucs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ucs.controller.message.Message;
import com.ucs.controller.message.MessageCode;
import com.ucs.factory.MessageFactory;
import com.ucs.factory.OrdinaryUserFactory;
import com.ucs.model.OrdinaryUser;
import com.ucs.service.IOrdinaryUserLoginService;
import com.ucs.util.MD5Util;
import com.ucs.util.StringUtil;

@Controller
public class OrdinaryUserLoginController {
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin() {
		return "/login";
	}
}
