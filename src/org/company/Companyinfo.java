package org.company;

/*Project     :CompanyDetails
   Package     :org.company
   Class       :CompanyInfo
   Methods     :companyName()

Description
You have to overload the method companyName() based on different Number of arguments.*/


public class Companyinfo {
	static int branchcode;
	static int a1=200;

	public void companyName(String branchname, int branchcode )
	{
		//int a1 =90;
		System.out.println(branchname+" " +branchcode+ " " +a1);
		//System.out.println(branchcode);
	}
	public void companyName(String city, String area)
	{
		System.out.println(city +" "+ area);
		
	}
	
	public static void main(String[] args) {
		
		Companyinfo Cio= new Companyinfo();
		Cio.companyName("GreensTech", branchcode);
		Cio.companyName("Chennai", "thuraipakkam");
		
		//System.out.println(a);
	}
}
