package org.javaCrashCourse;

public class DadCalledCollectAmount {

	public int amount =10000;
	double sis=100;
	
	public int amountToMe()
	{
//		System.out.println("Daddy amount collect " +amount+ " sent to you");
		return amount;
	}
	public void recahrge()
	{
		int ramount=100;
		System.out.println("son please recharge to my  mobile number Rs " +ramount);
	}
	
	public static void main(String[] args) {
		
		DadCalledCollectAmount dcca  = new DadCalledCollectAmount();
		int cash =dcca.amountToMe();
		System.out.println("amount " +cash+ " Received");
		dcca.recahrge();
	}
}
