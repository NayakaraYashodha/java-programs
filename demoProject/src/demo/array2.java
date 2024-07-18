package demo;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int index=0;
		int []ar=new int[n];
		for(int i=0; i<ar.length; i++)
		{
			 ar[i]=sc.nextInt();
			
		}
		//int count=0; 
		
		int k=sc.nextInt();
		for(int i=0; i<ar.length; i++) {
			
			if(ar[i]==k) {
				index=i;	
			}	
		}
       System.out.println(index);
	}
}
