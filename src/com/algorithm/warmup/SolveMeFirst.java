package com.algorithm.warmup;

import java.util.Scanner;

public class SolveMeFirst {
	
	/**
	 * Addition of two number
	 * @param a first Number to add
	 * @param b Second Number to add
	 * @return sum of two number
	 */
	 static int solveMeFirst(int a, int b) {
	        return a+b;
	   }

	   
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a;
	        a = in.nextInt();
	        int b;
	        b = in.nextInt();
	        int sum;
	        sum = solveMeFirst(a, b);
	        System.out.println(sum);
	   }

}
