package com.app;

import java.util.Scanner;

public class PrimeBetweenGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		FindPrime(n);
	}

	private static void FindPrime(int n) {
		int count;
		for(int i=0;i<=n;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if((i%j)==0)
					count++;
			}
			if(count==2) 
				System.out.print(i+" ");
			
		}
	}

}
