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
		int l=Integer.MAX_VALUE;
		int sl=Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			
			if(ar[i]>l) {
				sl=l;
				l=ar[i];
			}
			else if(ar[i]>sl && ar[i]!=l) {
				
				sl=ar[i];
			}
			
		}System.out.println(sl+l);
	}

}
