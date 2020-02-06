//OOPS Concepts Demonstration
import java.io.*;
import java.util.*;
class A
{
void overRide()
{
System.out.println("Over Ridding is taking place in Class A:");
}
void sumA(int i,int j)
{
System.out.println("I am Class A:");
System.out.println("Method Overloading  with 2 arg in Class A:"+(i+j));
}
void sumA(int i,int j,int k)
{
System.out.println("Method Overloading with 3 arg in Class A:"+(i+j+k));
}
void sumA(String name)
{
System.out.println("Method Overloading with String arg in Class A:: My nameis:"+name);
}
}
class B extends A
{
void sumB()
{
System.out.println("I am Class B:");
}
void overRide()
{
System.out.println("Over Ridding in Class B:");
}
}
class C extends B
{
void sumC()
{
System.out.println("I am Class C:");
}
}
interface InterfaceA
{
void add();
}
interface InterfaceB
{
void sub();
}
class InterfaceClass implements InterfaceA,InterfaceB
{
public void add()
{
System.out.println("I am Interface add method:");
}
public void sub()
{
System.out.println("I am Interface sub method:");
}
}
class TASK2
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a,b,c Values:");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println("Enter Ur Name:");
String str=s.next();
C obj=new C();
obj.sumA(a,b);
obj.sumA(a,b,c);
obj.sumA(str);
obj.overRide();
obj.sumB();
obj.sumC();
InterfaceClass obj1=new InterfaceClass();
obj1.add();
obj1.sub();
}
}