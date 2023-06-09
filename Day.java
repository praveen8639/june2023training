import java.util.*;
import java.lang.*;
class Day
{
public static void main(String args[])
{
System.out.println("Enter an integer to calculate the area");
Scanner sc=new Scanner(System.in);
double radius=sc.nextDouble();
double area=Math.PI * Math.pow(radius,2);
System.out.println(area);
}
}