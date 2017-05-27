package com.ucs.factory;

import com.ucs.controller.message.Message;

public class MessageFactory {
	public static Message produce() {
		return new Message();
	}
}
