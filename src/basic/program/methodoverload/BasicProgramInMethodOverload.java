package basic.program.methodoverload;

public class BasicProgramInMethodOverload {

	public static String palindromeNumber(int a) 
	{
		int b=0;
		for (int i = 0; i < a; i++) 
		{
			if(a%2==0)
			{
				b++;
				break;
			}
		}
		if(b==0)
		{
			return("Palindrome");
		}else
			return("Not a palindrome");
	}
	public static void main(String[] args) {
		String text = palindromeNumber(11);
		System.out.println(text);
	}

}
