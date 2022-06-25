package SampleJavaProgram;

public class StringReverseUsingarray {

	public static void main(String[] args) {
		
		String g="AGNI";
		char[] c=g.toCharArray();
		String R="";
		for(int i=c.length-1;i>=0;i--)
		{
			R=R+c[i];
			
		}
		System.out.println(R);
	}
}
