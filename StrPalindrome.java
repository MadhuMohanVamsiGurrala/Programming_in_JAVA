//Write a java program that checks whether a given string is palindrome or not. Ex. MALAYALAM is a palindrome.
import java.io.*;
import java.lang.String;
import java.util.*;
class StrPalindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter a string value\n");
String st=sc.nextLine();
String temp=st;
StringBuffer sb=new StringBuffer(st);
sb.reverse();
st=sb.toString();
if(temp.equals(st))
{
System.out.println("\n" +st+ "is a palindrome string.\n");
}
else
{
System.out.println("\n" +st+ "is not a palindrome string.\n");
}
}
}
