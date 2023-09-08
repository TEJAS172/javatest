package com.test1;

public class q5 {
	public void m1(int[] a) {
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]<a[j]) {
					k=a[i];
					a[i]=a[j];
					a[j]=k;
				}
			}for(int data:a) {
				System.out.println(data);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		q5 obj = new q5();
		obj.m1(arr);

	}

}
