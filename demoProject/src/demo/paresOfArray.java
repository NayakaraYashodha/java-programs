package demo;

import java.util.Scanner;

public class paresOfArray {

	static void printdeffrentPairs(int []ar,int k) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]-ar[j]==k)||(ar[j]-ar[i]==k)) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
	
	
	
//	static void printAllPairs(int []ar,int k) {
//		for(int i=0; i<ar.length-1; i++) {
//			for(int j=i+1; j<ar.length; j++) {
//				if(ar[i]+ar[j]==k) {
//					System.out.println(ar[i]+" "+ar[j]);
//				}
//			}  //output  k=6:- 4 2 
//		}                      1 5
//	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		printdeffrentPairs(ar, k);
	}

}

