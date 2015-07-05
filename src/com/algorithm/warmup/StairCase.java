package com.algorithm.warmup;

import java.util.Scanner;

public class StairCase {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i, j, k;
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=num;j++)
			{
				if((i+j)>num)
				{
					System.out.print("#");

				}

				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}
}
