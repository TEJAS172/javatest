package com.test1;

public class q4 {
	public void m1(int[] a) {
		int num=11;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==num) {
					System.out.println(i+""+j);
				}
				if(a[j]==11) {
					System.out.println(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,6,4,9,0,11};
		
		q4 obj = new q4();
		obj.m1(arr);

	}

}
