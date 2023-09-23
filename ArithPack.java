import pack.Addition;
import pack.Subtraction;
import java.io.*;
import java.lang.*;
class ArithPack
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\nEnter a value\n");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter b value\n");
int b=Integer.parseInt(br.readLine());
Addition obj = new Addition(a,b);
obj.sum();
double res = Subtraction.sub(a,b);
System.out.println("\nSubtraction is"+res);
}
}
