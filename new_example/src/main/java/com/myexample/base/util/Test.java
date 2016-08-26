package com.myexample.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		/*try {
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
			String d = "2014-06-01";
			Date date = s.parse(d);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		int t = 0;
		for(int i=1; i<=30;i++) {
			t += i;
		}
		System.out.println(t);
	}
}
