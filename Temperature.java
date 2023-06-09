import java.util.Scanner;
class Temperature{
public static void main(String args[])
{
System.out.println("enter an integer");
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
double f=9.0*c/5.0+32;
System.out.println(f);
}
}