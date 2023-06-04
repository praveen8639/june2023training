import java.util.Scanner;
class InputSwapDay4
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int num1,num2;
num1=scob.nextInt();
num2=scob.nextInt();
int temp;
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("\t"+num1 + "\t" + num2);
}
}