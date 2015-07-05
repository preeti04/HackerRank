package com.algorithm.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int temp = Integer.parseInt(a.nextLine());
        
		int arr[][]= new int[temp][temp];
		int sum=0,a1=0;;
		
		String line = "";
		
		   int rowNumber = 0;
		   while(rowNumber<temp) {
		       line = a.nextLine();
		       String[] elements = line.split(" ");
		       int elementCount = 0;
		       for(String element : elements) {
		          int elementValue = Integer.parseInt(element);
		          arr[rowNumber][elementCount] = elementValue;
		          elementCount++;
		       } 
		       rowNumber++;
		   }
		   
		   for (int i = 0; i < temp; ++i)
	        {
	            sum = sum + arr[i][i];
	            a1 = a1 + arr[i][temp - i - 1];
	            
	        }
		
		 System.out.println(Math.abs(sum-a1));
	}

}
