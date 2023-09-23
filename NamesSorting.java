//Write a java program for sorting a given list of names in ascending order
import java.io.*;
import java.lang.*;
import java.util.*;
class NameSorting
{
void sortStrings()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n = sc.nextInt();
String[] str = new String[n];
System.out.println("Enter strings: ");
for(int i = 0; i < n; i++)
{
str[i] = new String(sc.next());
}
for(int i = 0; i < n; i++)
{
for(int j = i+1; j < n; j++)
{
if(str[i].compareTo(str[j])>0)
{
String temp = str[i];
str[i] = str[j];
str[j] = temp;
}
}
}
System.out.println("Sorted list of strings is:");
for(int i = 0; i < n ; i++)
{
System.out.println(str[i]);
}
}
}
class NamesSorting
{
public static void main(String[] args)
{
NameSorting obj = new NameSorting();
obj.sortStrings();
}
}
