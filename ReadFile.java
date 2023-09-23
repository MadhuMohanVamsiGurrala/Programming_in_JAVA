//Write a Java Program that reads on file name form the user then displays information about whether the file exists, whether the file is readable/ writable, the type of file and the length of the file in bytes and display the content of the using FileInputStream class.
import java.io.*;
import java.lang.*;
class ReadFile
{
public static void main(String args[])
{
File f=new File("vamsi.txt");
if(f.exists())
{
System.out.println("File is exist and details about file");
System.out.println("File name is"+f.getName());
System.out.println("File path location is"+f.getAbsolutePath());
System.out.println(f.canRead()?"File is readable":"File is not readable");
System.out.println(f.canWrite()?"File is writable":"File is not writable");
System.out.println(f.isFile()?"F is file":"F is directory");
System.out.println("Length of the file" +f.length()+"bytes");
}
else
{
System.out.println("File not existed..!!");
}
}
}
