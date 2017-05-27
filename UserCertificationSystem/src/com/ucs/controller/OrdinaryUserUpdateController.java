package com.ucs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ucs.controller.message.Message;
import com.ucs.controller.message.MessageCode;
import com.ucs.factory.MessageFactory;
import com.ucs.service.IOrdinaryUserUpdateService;
import com.ucs.util.StringUtil;

@Controller
public class OrdinaryUserUpdateController {
	@Autowired
	private IOrdinaryUserUpdateService ordinaryUserUpdateService;
	
	@RequestMapping(value = "/updateUsername", method = RequestMethod.POST)
	public Message updateUsername(int id, String username, HttpSession session) {
		Message msg = MessageFactory.produce();
		if(id != (int)session.getAttribute("id")) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("����Ȩ�޸ĸ�id���û���");
			return msg;
		}
		if(!StringUtil.checkLength(username, 1, 30)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("�û���������1-30λ֮��");
			return msg;
		}
		ordinaryUserUpdateService.updateUsername(id, username);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("�޸��û����ɹ�");
		return msg;
	}
	
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public Message updatePassword(int id, String password, String affirm, HttpSession session) {
		Message msg = MessageFactory.produce();
		if(id != (int)session.getAttribute("id")) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("����Ȩ�޸ĸ�id������");
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
		String salt = StringUtil.getRandomString(10);
		ordinaryUserUpdateService.updatePassword(id, password, salt);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("�޸�����ɹ�");
		return msg;
	}
	
	@RequestMapping(value = "/updateNickname", method = RequestMethod.POST)
	public Message updateNickname(int id, String nickname) {
		Message msg = MessageFactory.produce();
		if(!StringUtil.checkLength(nickname, 1, 30)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("�ǳƳ�����1-30λ֮��");
			return msg;
		}
		ordinaryUserUpdateService.updateNickname(id, nickname);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("�޸��ǳƳɹ�");
		return msg;
	}
	
	@RequestMapping(value = "/updateState", method = RequestMethod.POST)
	public Message updateState(int id, int state) {
		Message msg = MessageFactory.produce();
		ordinaryUserUpdateService.updateState(id, state);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("�޸�״̬�ɹ�");
		return msg;
	}
}
