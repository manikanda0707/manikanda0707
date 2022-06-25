package Stringprograms;

public class StringBasicprogram {

	public static void main(String[] args) {
		
		String str="manikanda prabu";
		String str1="manikanda prabu";
		String str2="prabu";
		String str3="PrABu";
		String str4="";
		String str5="    i am a good Boy   ";
		
		//charAt() method is check the position in the String 
		System.out.println("given string in 5th position char is "+str.charAt(5));
		//length() method is used to find the given string length
		System.out.println("given String length is "+str.length());
		//equals() method is to compare the string,here str and str1,result will come on boolean value
		//A Boolean value: if TRUE is the String are equal or else False, the String is not equal
		System.out.println("Comparsion of two string is "+str.equals(str1));
		//equals() method is to compare the string,here str1 and str2,result will come on boolean value
		System.out.println("Comparision of two String is "+str.equals(str2));
		//equalsIgnoreCase() methos is doesn't check case sensitive, check only two string 
		System.out.println("Comparision of two string is "+str2.equalsIgnoreCase(str3));
		//isEmpty() method is to check the string is empty or not, the result will come on boolean value
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		//contains() method is used to check whether the string have sequence of character, the result will come on boolean value
		System.out.println(str.contains("mani"));
		//subString() is used get the subString of subset of another Sting
		//startindex is inclusive
		//EndIndex is exclusive
		System.out.println("Substring starting from 10 position "+str.substring(10));
		System.out.println("Substring starting from 0 to 9 position "+str.substring(0, 9));
		//concat() method is used to adding two string
		System.out.println("Adding two string "+str2.concat(str3));
		System.out.println("replace word prabu is "+str2.replace('u', 'o'));//here u is target and o is replacement
		System.out.println("Get the index of value 'a' from " +str2+ " is "+str2.indexOf('a'));
		System.out.println("having extra space in "+str5+"Trim method after deliting the space "+str5.trim());
		//string valueOf() methods conver diffrent datatype to string,
		//boolean to string,float to string, int to string etc.. example below
		int a=30;
		String s1=String.valueOf(a);
		System.out.println("Conversion of int to String is "+s1+10);
		System.out.println("To change uppercse "+str2+ " is "+str2.toUpperCase());
		System.out.println("To change lowercse "+str3+ " is "+str3.toLowerCase());
		System.out.println("To change uppercse "+str2+ " is "+str2.toUpperCase());
		String s2=String.join("-", "Are", "you", "willing", "to"," learn java program");
		System.out.println("String.join() method used to join each word using - example below");
		System.out.println(s2);
		
	}
}
