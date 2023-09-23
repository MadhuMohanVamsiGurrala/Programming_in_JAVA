//Write a java program that illustrates how runtime polymorphism is achieved .
import java.io.*;
import java.lang.*;
class Bike
{
void ride()
{
System.out.println("riding....");
}
}
class Hero extends Bike
{
void ride()
{
System.out.println("riding hero...");
}
}
class Honda extends Bike
{
void ride()
{
System.out.println("riding honda...");
}
}
class Bajaj extends Bike
{
void ride()
{
System.out.println("riding bajaj...");
}
}
class RunTimePolymorphism
{
public static void main(String args[])
{
Bike b;
b=new Hero();
b.ride();
b=new Honda();
b.ride();
b=new Bajaj();
b.ride();
}
}
