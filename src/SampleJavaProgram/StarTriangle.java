package SampleJavaProgram;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		int row,column=0;
		System.out.println("enter the rows: ");
		Scanner s =new Scanner(System.in);
		int line;
		line=s.nextInt();
		for(row=0;row<=line;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
