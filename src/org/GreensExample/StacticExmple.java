package org.GreensExample;

public class StacticExmple {

	public static int a;
	
	public void name() {
		
		int a=20;
		int b=++a;
		
		++a;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		++a;
		++a;
		++a;
		++a;
		++a;
		System.out.println(a);
		StacticExmple se = new StacticExmple();
		se.name();
	}
}
