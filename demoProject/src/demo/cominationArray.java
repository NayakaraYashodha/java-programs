package demo;

import java.util.Scanner;

public class cominationArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int []ar=new int [n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0; i<ar.length; i++) {
			sum=sum+ar[i];
		}
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		
	for(int i=0; i<ar.length; i++) {
		if(ar[i]<min) {
			min=ar[i];
		}
		
	}
	System.out.println(sum-max);
	System.out.println(sum-min);

}
}
