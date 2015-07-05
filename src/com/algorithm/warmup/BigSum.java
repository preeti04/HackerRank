package com.algorithm.warmup;

import java.util.Scanner;

public class BigSum {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int test = sc.nextInt();
	        long arr[] = new long[test];
	        long sum=0;
	        for(int i=0;i<test; i++){
	            arr[i]= sc.nextLong();
	            sum+=arr[i];
	        }
	              
	        
	        System.out.println(sum);
	    }
}
