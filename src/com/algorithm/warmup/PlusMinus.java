package com.algorithm.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	
	 public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			double a[] = new double[t];
			double countNegative=0;
			double countPositive=0;
			double countZero=0;
			sc.nextLine();
			for(int i=0;i<t;i++){

				a[i]= sc.nextInt();
				
				if(a[i]< 0)
					countNegative++;
				else if(a[i]>0)
					countPositive++;
				else
					countZero++;
			}

			
			DecimalFormat newFormat = new DecimalFormat(".###");
			System.out.println(Double.valueOf(newFormat.format(countPositive/a.length)));
			System.out.println(Double.valueOf(newFormat.format(countNegative/a.length)));
			System.out.println(Double.valueOf(newFormat.format( countZero/a.length)));
			
			
	}

}
