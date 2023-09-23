//Write a Java Program to implement a Queue, using user defined Exception Handling (also make use of throw, throws)
import java.util.Scanner;
import java.io.*;
import java.lang.*;
class ExceptionQueue extends Exception
{
ExceptionQueue(String s)
{
super(s);
}
}
class Queue
{
int front,rear;
int q[] = new int[10];
Queue()
{
rear = -1;
front = -1;
}
void enqueue(int n) throws ExceptionQueue
{
if(rear == 9)
throw new ExceptionQueue("Queue is full");
rear++;
q[rear]=n;
if(front == -1)
front = 0;
}
int dequeue() throws ExceptionQueue
{
if(front == -1)
throw new ExceptionQueue("Queue is empty");
int temp = q[front];
if(front == rear)
front  = rear = -1;
else
front++;
return(temp);
}
}
class UseQueue
{
public static void main(String args[])
{
Queue a = new Queue();
try
{
a.enqueue(5);
a.enqueue(20);
}
catch(ExceptionQueue e)
{
System.out.println(e.getMessage());
}
try
{
System.out.println(a.dequeue());
System.out.println(a.dequeue());
System.out.println(a.dequeue());
}
catch(ExceptionQueue e)
{
System.out.println(e.getMessage());
}
}
}
