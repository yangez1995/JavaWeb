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
			msg.setObject("你无权修改该id的用户名");
			return msg;
		}
		if(!StringUtil.checkLength(username, 1, 30)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("用户名长度在1-30位之间");
			return msg;
		}
		ordinaryUserUpdateService.updateUsername(id, username);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("修改用户名成功");
		return msg;
	}
	
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public Message updatePassword(int id, String password, String affirm, HttpSession session) {
		Message msg = MessageFactory.produce();
		if(id != (int)session.getAttribute("id")) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("你无权修改该id的密码");
			return msg;
		}
		if(!StringUtil.checkLength(password, 6, 16)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("密码长度在6-16位之间");
			return msg;
		}
		if(!password.equals(affirm)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("两次输入密码不一致");
			return msg;
		}
		String salt = StringUtil.getRandomString(10);
		ordinaryUserUpdateService.updatePassword(id, password, salt);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("修改密码成功");
		return msg;
	}
	
	@RequestMapping(value = "/updateNickname", method = RequestMethod.POST)
	public Message updateNickname(int id, String nickname) {
		Message msg = MessageFactory.produce();
		if(!StringUtil.checkLength(nickname, 1, 30)) {
			msg.setWhat(MessageCode.FAIL);
			msg.setObject("昵称长度在1-30位之间");
			return msg;
		}
		ordinaryUserUpdateService.updateNickname(id, nickname);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("修改昵称成功");
		return msg;
	}
	
	@RequestMapping(value = "/updateState", method = RequestMethod.POST)
	public Message updateState(int id, int state) {
		Message msg = MessageFactory.produce();
		ordinaryUserUpdateService.updateState(id, state);
		msg.setWhat(MessageCode.SUCCESSFUL);
		msg.setObject("修改状态成功");
		return msg;
	}
}
