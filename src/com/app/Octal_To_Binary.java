package com.app;

import java.util.Scanner;

public class Octal_To_Binary {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int d= 0, i = 0;
    long b = 0;

    while(n != 0)
    {
        d += (n % 10) * Math.pow(8, i);
        i++;
        n/=10;
    }

    i = 1;

    while (d != 0)
    {
        b += (d% 2) * i;
        d/= 2;
        i *= 10;
    }
    System.out.println(b);
}
}
