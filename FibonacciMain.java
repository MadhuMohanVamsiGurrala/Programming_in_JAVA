//The fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1,1. Every subsequent value is the sum of the 2 values preceding it. Write  a java program that uses both recursive and non recursive functions to print the nth value of the Fibonacci sequence
import java.io.*;
import java.lang.*;
import java.util.*;
class fib
{
int fibrec(int n)
{
if(n==1)
return 0;
else if(n==2)
return 1;
else
return(fibrec(n-1)+fibrec(n-2));
}
int fibnonrec(int n)
{
int a=0,b=1,c=0;
for(int i=3;i<=n;i++)
{
c=a+b;
a=b;
b=c;
}
return c;
}
}
class FibonacciMain
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int result,result1;
System.out.println("Enter an integer:");
int n=Integer.parseInt(br.readLine());
fib f=new fib();
System.out.println("\n1. FIBONACCI WITH RECURSION \n2. FIBONACCI WITHOUT RECURSION");
System.out.println("Enter your choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("FIBONACCI SERIES USING RECURSION");
result=f.fibrec(n);
System.out.println("Fibonacci of"+n+"th position is"+result);
break;
case 2:
System.out.println("FIBONACCI SERIES WITHOUT USING RECURSION");
result1=f.fibrec(n);
System.out.println("Fibonacci of"+n+"th position is"+result1);
break;
}
}
}
