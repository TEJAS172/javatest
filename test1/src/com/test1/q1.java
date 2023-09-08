package com.test1;

public class q1 {
	public String m1(int num) {
		int t=num;
		int sum=0;
		while(t>0) {
			int b=t%10;
			
			sum=sum*10+b;
			t=t/10;
		}
		if(num==sum) {
			return "It is Palindrome";
		}
		return " Not Palindrome";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		
		q1 obj = new q1();
		String result=obj.m1(num);
		System.out.println(result);

	}

}
