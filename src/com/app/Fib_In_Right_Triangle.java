package com.app;

public class Fib_In_Right_Triangle {
public static void main(String [] args)
{
	int i,j,k,n=5,a=0,b=1,c=1;
    System.out.print(a);
    for(i=0;i<n;i++)
    {   
        for(j=1;j<=i;j++){
        System.out.print(c);
        c=a+b;
        a=b;
        b=c;}
        System.out.println();
    }
}
}
