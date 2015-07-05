package com.algorithm.warmup;

import java.util.Scanner;

public class LibraryFine1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String actualDate = sc.nextLine();
		String expectedDate = sc.nextLine();
		
		String actualArr[] = actualDate.split(" ");
		String expectedArr[] = expectedDate.split(" ");
		int fine = 0;
		
		if(Integer.valueOf(actualArr[2])!=Integer.valueOf(expectedArr[2])){
			
			if(Integer.valueOf(actualArr[2])>Integer.valueOf(expectedArr[2])){
				fine=10000;
			}
		}
		
		else if(Integer.valueOf(actualArr[1])!=Integer.valueOf(expectedArr[1])){
			
			fine=(Math.max((Integer.valueOf(actualArr[1])-Integer.valueOf(expectedArr[1])),0))*500;
		}
		
		else {
			fine=(Math.max((Integer.valueOf(actualArr[0])-Integer.valueOf(expectedArr[0])),0))*15;
		}
		System.out.println(fine);
	}

}
