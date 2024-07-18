package demo;

import java.util.Scanner;

public class productElem {
	 static int product(int[] ar) {
		int prod=1;
		for(int i=0; i<ar.length; i++) {
			prod=prod*ar[i];
		}
		return prod;
	}
	 static int[] productofn(int[]ar) {
	 int[]res=new int[ar.length];
	 int prod=product(ar);
		for(int i=0; i<ar.length; i++) {
			ar[i]=prod/ar[i];
		}
		return res;
	 }
	
	 
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length; i++) {
			int[]res=productofn(ar);
				System.out.println(res);
		}	
	
		}
	
	}


