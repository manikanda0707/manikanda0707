package com.star.program;

import java.util.Formatter;

public class NumberSquare {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <=9 ; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.print("\t"+(i+j-1));
				
			}
			System.out.print("\n");
		}


	}

}
