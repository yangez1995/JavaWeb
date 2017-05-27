package com.ucs.util;

import java.util.Random;

public class StringUtil {
	public static boolean isEmpty(String string) {
		if((string == null) || ("".equals(string.trim()))) {
			return true;
		}
		return false;
	}
	
	public static boolean checkLength(String string, int min, int max) {
		if((string.length() < min) || (string.length() > max)) {
			return false;
		}
		return true;
	}
	
	public static String getRandomString(int length) {
		String base = "abcdefghijklmnopqrstuvwxyz"
				+ "ABCDEFGHIGKLMNOPQRSTUVWXYZ"
				+ "1234567890";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
	
	public static String omitString(int length, String str) {
		String omitStr = str.substring(0, length) + "...";
		return omitStr;
	}
	
	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
