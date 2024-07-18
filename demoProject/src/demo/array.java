package demo;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
			
				int []ar=new int[n];
				for(int i=0; i<ar.length;i++) {
					ar[i]=sc.nextInt();	
				}	
				int max=Integer.MIN_VALUE;
				for(int i=0; i<ar.length; i++)
				{
					if(ar[i]>max) {
					max=ar[i];
					}
					
				}
				System.out.println(max);
//				int res=sum(ar);
//				System.out.println(res);
//			}
//	
//	static int sum(int[]ar) {
//		int sum=0;
//		for(int i=0; i<ar.length; i++) {
//			sum=sum+ar[i];
//		}
//		return(sum);
	}	
}
