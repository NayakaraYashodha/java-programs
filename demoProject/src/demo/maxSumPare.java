package demo;

import java.util.Scanner;

public class maxSumPare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int s=Integer.MAX_VALUE;
		int ss=Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			
			if(ar[i]<s) {
				ss=s;
				s=ar[i];
			}
			else if(ar[i]<ss && ar[i]!=s) {
				
				ss=ar[i];
			}
			
		}System.out.println(ss+s);
	}

}
