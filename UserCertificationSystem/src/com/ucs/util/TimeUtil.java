package com.ucs.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	private static Date nowDate;
	public static Date getNowDate(){
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd ");
		String time=format.format(date);
		try {
			nowDate = format.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return nowDate;
	}
	
	public static Date getNowTime(){
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		try {
			nowDate = format.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return nowDate;
	}
}
