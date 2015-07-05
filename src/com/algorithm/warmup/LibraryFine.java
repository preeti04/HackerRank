package com.algorithm.warmup;

import java.util.Scanner;

public class LibraryFine {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String actualDate = sc.nextLine();
		String expectedDate = sc.nextLine();
		
		String actualArr[] = actualDate.split(" ");
		String expectedArr[] = expectedDate.split(" ");
		int fine = 0;
		
		if(Integer.valueOf(actualArr[2])  > Integer.valueOf(expectedArr[2])){
			fine = 10000;
		}
		
		else if(Integer.valueOf(actualArr[2])  < Integer.valueOf(expectedArr[2])){
			fine =0;
			
		}
		
		else if(Integer.valueOf(actualArr[1])  > Integer.valueOf(expectedArr[1])){
			fine = 500 * ( Integer.valueOf(actualArr[1]) - Integer.valueOf(expectedArr[1]));
		}
		
		else if(Integer.valueOf(actualArr[1]) < Integer.valueOf(expectedArr[1])){
			fine=0;
					
		}
		
		else if(Integer.valueOf(actualArr[0]) > Integer.valueOf(expectedArr[0])){
			fine = 15 * ( Integer.valueOf(actualArr[0]) - Integer.valueOf(expectedArr[0]) );
		}
		else{
			fine=0;
		}
			
		System.out.println(fine);
	}

}
