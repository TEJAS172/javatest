package com.test1;

public class q4 {
public static void m1(int[] arr,int num) {
		
		for(int i=0;i<arr.length;i++) {
			int res=arr[i];
			if(arr[i]==num) {
				System.out.println(i);
			}
			for(int j=i+1;j<arr.length;j++) {
				res=res+arr[j];
				if(res>11) {
					break;
				}
				if(res==num) {
					System.out.println(i+""+j);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,6,4,9,0,11,};
		int num=11;
		q4.m1(arr, num);
	}

}
