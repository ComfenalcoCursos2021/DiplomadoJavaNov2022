package com.diplomado.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDate {

	
	
	public static String goToFormat(Date date, String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		String dateFormatted = simpleDateFormat.format(date);
		return dateFormatted;
	}
	
	public static Date addMonths(Date origin, int months) {
		Calendar c = Calendar.getInstance();
		c.setTime(origin);
		c.add(Calendar.MONTH, months);
		return c.getTime();
	}
	
	public static long diferenciaHoras(Date fechaInicial, Date fechaFinal ) {
		long difference_In_Time = fechaInicial.getTime() - fechaFinal.getTime();
		long difference_In_Hours
        = (difference_In_Time
           / (1000 * 60 * 60))
          % 24;
		return difference_In_Hours;
	}
	
	public static Date addHours(Date origin, int hours) {
		Calendar c = Calendar.getInstance();
		c.setTime(origin);
		c.add(Calendar.HOUR, hours);
		return c.getTime();
	}
	
	
	
}
