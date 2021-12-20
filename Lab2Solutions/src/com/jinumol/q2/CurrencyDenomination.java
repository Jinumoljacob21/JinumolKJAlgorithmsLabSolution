package com.jinumol.q2;

public class CurrencyDenomination {

	public void currencycount(int amount, int[] currency) {
		
		int count[] = new int[currency.length];
		try {
			for(int i=0;i<currency.length;i++) {
				count[i]=amount/currency[i];
				amount=amount-(count[i]*currency[i]);
				
			}
			if(amount>0) {
				System.out.println("Exact amount not able to pay with the highest denominations");
			}
			else {
			for(int i=0;i<currency.length;i++) {
				if(count[i]!=0) {
					System.out.println(currency[i]+"  :  "+count[i]);
				}
			}
			}
		}catch(ArithmeticException e) {
			System.out.println(e+"currency of denomination zero is invalid");
			
		}
			
		
	}
}