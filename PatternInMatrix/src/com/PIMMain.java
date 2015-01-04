package com;

import java.util.Scanner;

public class PIMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowSize,columnSize,i,j,k,l;
		int [][]mainMatrix;int[] intPatArr;
		String pattern;
		char[] patternArr;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter row size:");
		rowSize=scan.nextInt();
		System.out.println("Enter column size:");
		columnSize=scan.nextInt();
		mainMatrix=new int[rowSize][columnSize];
		
		for(i=0;i<rowSize;i++)
		{
			for(j=0;j<columnSize;j++)
			{
				System.out.println("Enter element at "+i+j+" position:");
				mainMatrix[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("the matrix u entered is:");
		for(i=0;i<rowSize;i++)
		{
			for(j=0;j<columnSize;j++)
			{
				System.out.print(mainMatrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		System.out.println("Enter the pattern to be checked:");
		pattern=scan.next();
		patternArr=pattern.toCharArray();
		if(patternArr.length>columnSize)
		{
			System.out.println("Pattern size more than column size");
			System.exit(0);
		}
		intPatArr=new int[patternArr.length];
		for(i=0;i<patternArr.length;i++)
			intPatArr[i]=Character.getNumericValue(patternArr[i]);
		
		System.out.println("Printing Integer array rep of Pattern String:");
		for(i=0;i<patternArr.length;i++)
			System.out.print(intPatArr[i]+"\t");
		
		
		System.out.println("\n---------------------------");
		for(i=0;i<rowSize;i++)
		{
			for(j=0,k=0;j<columnSize-1;j++)
			{
				if((k+1)<intPatArr.length)
				if(intPatArr[k]==mainMatrix[i][j])
				{
					if(intPatArr[k+1]==mainMatrix[i][j+1])
						k++;
					else
						break;
				}
			}
			
			if(k==intPatArr.length-1)
				System.out.println("Pattern Found at row number:"+i);
		}
		
		
	}

}
