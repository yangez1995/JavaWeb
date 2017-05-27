package com.ucs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ucs.controller.message.Message;
import com.ucs.controller.message.MessageCode;
import com.ucs.factory.MessageFactory;
import com.ucs.factory.OrdinaryUserFactory;
import com.ucs.model.OrdinaryUser;
import com.ucs.service.IOrdinaryUserMessageInsertService;
import com.ucs.service.IOrdinaryUserRegistService;
import com.ucs.util.StringUtil;

@Controller
public class OrdinaryUserRegistController {
	@Autowired
	private IOrdinaryUserRegistService ordinaryUserRegistService;
	@Autowired
	private IOrdinaryUserMessageInsertService ordinaryUserMessageInsertService;
	
	@RequestMapping(value = "/userRegist", method = RequestMethod.GET)
	public String userRegist() {
		return "/regist";
	}
	
	@RequestMapping(value = "/userRegist", method = RequestMethod.POST)
	public Message userRegist(String username, String password, String affirm) {
		Message msg = MessageFactory.produce();
		if(!StringUtil.checkLength(username, 1, 30)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("�û���������1-30λ֮��");
			return msg;
		}
		if(ordinaryUserRegistService.checkUsernameRepeat(username) > 0) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("���û����ѱ�ע��");
			return msg;
		}
		if(!StringUtil.checkLength(password, 6, 16)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("���볤����6-16λ֮��");
			return msg;
		}
		if(!password.equals(affirm)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("�����������벻һ��");
			return msg;
		}
		OrdinaryUser user = OrdinaryUserFactory.produce(username, password);
		ordinaryUserRegistService.userRegist(user);
		int id = user.getId();
		ordinaryUserMessageInsertService.newUser(id, "", "");
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("ע��ɹ������IDΪ" + user.getId());
		return msg;
	}
}
