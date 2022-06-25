package org.javaCrashCourse;

public class DefaultConstructorUsing {
	
	static String prabu ;
	String devi;
	
	public DefaultConstructorUsing(String name, String type) {
	
		prabu = name;
		devi = type;
		
	}
	public void marriage() {
		System.out.println("Marriage status"+prabu+ ", " +devi);
		

	}
	public static void main(String[] args) {
		int a1=5;
		String word ="abcde";
		for (int i = 0; i < word.length()-1; i+=2) {
			System.out.println(i);
			
		}
		
		DefaultConstructorUsing dcf = new DefaultConstructorUsing("male", "female");
		//System.out.println(prabu);
		dcf.marriage();
		DefaultConstructorUsing dcf1 = new DefaultConstructorUsing("married", "married");
		System.out.println(prabu);
		dcf1.marriage();
		dcf.marriage();
		dcf1.marriage();
		DefaultConstructorUsing dcf2 = new DefaultConstructorUsing("not married", "not married");
		dcf.marriage();
		dcf2.marriage();
	}

}
