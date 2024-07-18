package demo;

import java.util.Scanner;

public class seconLargest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int h=Integer.MIN_VALUE;
		int sh=Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			
			if(ar[i]>h) {
				sh=h;
				h=ar[i];
			}
			else if(ar[i]>sh && ar[i]!=h) {//same numbers is chouse second option
				
				sh=ar[i];
			}
			
		}System.out.println(sh);

	}

}
