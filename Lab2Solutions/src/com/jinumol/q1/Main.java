package com.jinumol.q1;

import java.util.Scanner;

public class Main {
	
	 
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total number of target that needs to achived");
		int targetNum=sc.nextInt();
		
		for(int i=0;i<targetNum;i++) {
		System.out.println("Enter the "+ (i+1)+"  target value");
		int target=sc.nextInt();
		checkTarget(arr,arr.length,target);
		}
		
		
		sc.close();
	}

	private static void checkTarget(int[] arr, int size, int target) {
	
		int flag=0,sum=0;
		for(int i=0;i<size;i++) {
			sum+= arr[i];
			if(sum>=target) {
				System.out.println("Target achived after "+(i+1)+" transactions");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Given target is not achived");
		}
	}
	

}
