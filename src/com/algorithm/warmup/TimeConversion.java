package com.algorithm.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
		
		  Date date = null;
	      String output = null;
	      try{
	         //Converting the input String to Date
	    	 date= df.parse(time);
	         //Changing the format of date and storing it in String
	    	 output = outputformat.format(date);
	         //Displaying the date
	    	 System.out.println(output);
	      }catch(ParseException pe){
	         pe.printStackTrace();
	       }
	      
	   
	   	}

}
