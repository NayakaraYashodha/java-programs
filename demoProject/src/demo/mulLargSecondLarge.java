package demo;

import java.util.Scanner;

public class mulLargSecondLarge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []ar=new int [n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int larg=Integer.MIN_VALUE;
		int secondlarg=Integer.MIN_VALUE;
		int smal=Integer.MAX_VALUE;
		int secondSmal=Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>larg) {
				secondlarg=larg;
				larg=ar[i];
			}
			else if(ar[i]>secondlarg) {
				secondlarg=ar[i];
			}
			
				if(ar[i]<smal) {
					secondSmal=smal;
					smal=ar[i];	
				}
				else if(ar[i]<secondSmal) {
					secondSmal=ar[i];
				}
		}
		//System.out.println(larg*seconlarg);//mulatiplya number in largest number
		//System.out.println(larg);//larger number of array element
		
		//System.out.println(seconlarg);//second largest number in array element
		
		//System.out.println(larg+seconlarg);//add largest and seconlargest
		
		
		int p1=larg*secondlarg;
		int p2=smal*secondSmal;
		int p3=larg*smal;
		
		
		//System.out.println(p1<p2?p1:p2);//smalest multiplecation
		System.out.println(p1>p2 ? p1:p2);
	}
}
