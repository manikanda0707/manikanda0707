package org.javaCrashCourse;

import com.sun.java.swing.plaf.motif.resources.motif;
import com.sun.javafx.sg.prism.NGShape.Mode;
import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

public class StaticMethodExample {

	public void Mode()
	{
		System.out.println("good");
		heloo();
	}
	public static void heloo(){
		String name = "hello";
		System.out.println(name);
		
	}
	public static void main(String[] args) {
	System.out.println("hai");
	StaticMethodExample sme = new StaticMethodExample();
	heloo();
	sme.Mode();
}
}
