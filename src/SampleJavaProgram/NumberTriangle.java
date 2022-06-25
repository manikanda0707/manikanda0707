package SampleJavaProgram;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		int num=1;
		int row,column=0;
		System.out.println("Enter the rows:");
		Scanner s=new Scanner(System.in);
		int line;
		line=s.nextInt();
		
		for(row=0;row<line;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print(num+"" );
				num=num+1;
			}
			System.out.println();
		}
	}
}
