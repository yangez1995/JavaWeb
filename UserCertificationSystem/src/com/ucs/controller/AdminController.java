package com.ucs.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ucs.model.OrdinaryUser;
import com.ucs.service.imp.OrdinaryUserSelectService;

@Controller
public class AdminController {
	@Autowired
	private OrdinaryUserSelectService ordinaryUserSelectService;
	
	@RequestMapping(value = "/admin",method = RequestMethod.GET)
	public String admin(HttpSession session) {
		/*OrdinaryUser user = (OrdinaryUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println(user.toString());*/
		return "/admin";
	}
	
	@ResponseBody
	@RequestMapping(value = "/getUserPagination",method = RequestMethod.GET)
	public int getUserPager() {
		int record = ordinaryUserSelectService.selectCount();
		if(record % 15 != 0) {
			return record/15 + 1;
		} else {
			return record/15;
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/getUserAccount",method = RequestMethod.POST)
	public List<OrdinaryUser> getUserAccount(int pageIndex) {
		List<OrdinaryUser> list = new ArrayList<OrdinaryUser>();
			list = ordinaryUserSelectService.getUserAccount((pageIndex-1)*10, 15);
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/getUserMessage",method = RequestMethod.POST)
	public List<OrdinaryUser> getUserMessage(int pageIndex) {
		List<OrdinaryUser> list = new ArrayList<OrdinaryUser>();
		list = ordinaryUserSelectService.getUserMessage((pageIndex-1)*10, 15);
		return list;
	}
}
