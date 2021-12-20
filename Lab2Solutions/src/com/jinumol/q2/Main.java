package com.jinumol.q2;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the size of currency denominations");
		 int size=sc.nextInt();
		 int currency[]=new int[size];
		 
		 System.out.println("Enter the currency denomination values");
		 for (int i=0;i<size;i++) {
			 currency[i]=sc.nextInt();
		 }
		 
		 System.out.println("Enter the amount you want to pay");
		 int payAmount=sc.nextInt();
		 
		 MergeSort mergesort=new MergeSort();
		 mergesort.sort(0,size-1,currency);
		 /*for(int i=0;i<size;i++) {
		 System.out.println(currency[i]);
		 } */
		 
		 CurrencyDenomination cd=new CurrencyDenomination();
		 System.out.println("Your payment apporoach in order to give min no of notes will be /n");
		 cd.currencycount(payAmount,currency);
		 
		 sc.close();
	}

}
