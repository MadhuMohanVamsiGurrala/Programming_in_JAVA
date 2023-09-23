//Write a java program that prompts the user for an integer and then prints out all the prime numbers up to that integer
import java.io.*;
import java.lang.*;
import java.lang.String;
class Prime
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,n,count;
System.out.println("Enter any integer value:");
n=Integer.parseInt(br.readLine());
System.out.println("The prime numbers upto "+n+" are:\n");
for(i=0;i<=n;i++)
{
count =0;
for(j=1;j<=i;j++)
{
if(i%j==0)
count=count+1;
}
if(count==2)
System.out.print(i+"\t");
}
}
}
