package com.test1;

public class q1 {
	public void m1() {
		int num=1221;
		int sum=0;
		while(num>0) {
			int b1 = num%10;
			sum = (sum*10)/b1;
			num = num/10;
			
		}
		if(sum==num) {
			System.out.println("It is palindrom");
		}if(num!=sum) {
			System.out.println("Not a palindrom");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		q1 obj = new q1();
		obj.m1();

	}

}
