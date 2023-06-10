import java.util.Scanner;
class Polymorphism
{
void print(){System.out.println("Welcome");}
void print(String n){System.out.println("Welcome");}
}
class Test5{
public static void main(String args[])
{
Polymorphism ob=new Polymorphism();
ob.print();
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String s=sc.next();
ob.print(s);
}
}