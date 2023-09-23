//Write a Java Program demonstrating the life cycle of a thread.
class First implements Runnable
{
Thread t;
First()
{
t=new Thread(this);
System.out.println("Good Morning");
t.start();
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Good Morning"+i);
try
{
t.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class Second implements Runnable
{
Thread t;
Second()
{
t=new Thread(this);
System.out.println("Hello World!");
t.start();
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Hello World!"+i);
try
{
t.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class Third implements Runnable
{
Thread t;
Third()
{
t=new Thread(this);
System.out.println("Welcome..");
t.start();
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Welcome.."+i);
try
{
t.sleep(3000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
public class MultiThread
{
public static void main(String args[])
{
new First();
new Second();
new Third();
}
}
