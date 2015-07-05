package com.algorithm.warmup;

import java.util.Scanner;

public class DiagonalDifference1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		int arr[][] = new int[temp][temp];
		int dia1Sum=0, dia2Sum=0;
		for(int i=0; i<temp;i++){
			
			for(int j=0;j<temp;j++){
				
				arr[i][j] = sc.nextInt();
				if(i==j)
					dia1Sum+=arr[i][j];
				if(i==temp-j-1)
					dia2Sum+=arr[i][j];
					
			}
		}
		
		System.out.println(Math.abs(dia1Sum - dia2Sum));
		
	}

}
