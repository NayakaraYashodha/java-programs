package demo;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0; i<ar.length; i++) {
			
				System.out.print(ar[i]+" ");
			}
		}

	}


