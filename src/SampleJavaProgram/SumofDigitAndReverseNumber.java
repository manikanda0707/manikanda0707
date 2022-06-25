package SampleJavaProgram;

public class SumofDigitAndReverseNumber {

	public static void main(String[] args) {
		int num = 253;
		int result=0;
		System.out.print("Reverse number is ");
		while(num>0)
		{
			
			int a=num%10;
			result=result+a;
			num=num/10;
			System.out.print(+a);
		}
		System.out.println();
		System.out.println("sum of Digit is "+result);
	}
}
