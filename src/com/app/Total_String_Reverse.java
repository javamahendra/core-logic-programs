package com.app;
/*write a program to reverse the string
 input-javadeveloper
 output-repolevedavaj
 */
public class Total_String_Reverse {
public static void main(String[] args)
{
	String s="javadeveloper";
	char[] ch=s.toCharArray();
    for(int i=(ch.length)-1;i>=0;i--)
      System.out.print(ch[i]);

}
}
