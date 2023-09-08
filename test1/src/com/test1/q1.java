package com.test1;

public class q1 {
	public static String m1(int num) {
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
		int num=12213;
		String result=m1(num);
		System.out.println(result);

	}

}
