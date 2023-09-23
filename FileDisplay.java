//Write a Java Program that displays the number of characters, lines and words in a text/text file.
import java.io.*;
import java.lang.*;
class FileDisplay
{
public static void main(String args[]) throws IOException
{
System.out.println("Enter the name of file:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=new String(br.readLine());
FileInputStream f=new FileInputStream(s);
int n;
int nc=0,nl=0,nw=0;
n=f.read();
while(n!=-1)
{
if(n=='\n')
nl++;
if(n==' '||n=='\n')
nw++;
n=f.read();
nc++;
}
f.close();
System.out.println("Number of lines are "+nl);
System.out.println("Number of words are"+nw);
System.out.println("Number of characters are"+nc);
}
}
