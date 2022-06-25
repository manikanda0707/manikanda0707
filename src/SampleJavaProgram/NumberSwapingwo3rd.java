package SampleJavaProgram;

public class NumberSwapingwo3rd {

	public static void main(String[] args) {
		
		int first=5000;
		int second=10000;
		int temp;
		first=first-second;
		second=second+first;
		first=second-first;
		System.out.println(first);
		System.out.println(second);
	}
}
