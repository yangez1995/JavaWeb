package com.ucs.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	public static String getMD5code(String password, String salt) {
		try {
			String sPassword = password + salt;
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(sPassword.getBytes());
			byte b[] = md.digest();
			
			int i;
			
			StringBuffer sbuf = new StringBuffer("");
			for(int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if(i < 0) {
					i += 256;
				}
				if(i < 16) {
					sbuf.append("0");
				}
				sbuf.append(Integer.toHexString(i));
			}
			return sbuf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}
}
