import java.util.Scanner;
class Factorial{
public static int calculateFactorial(int n){
if(n==0)return 1;
else return n* calculateFactorial(n-1);
}//class Factorial()
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer to find its Factorial");
int inputNum=sc.nextInt();
if(inputNum<0)
System.out.println("INVALID");
else System.out.println(calculateFactorial(inputNum));
}//main method
}//Factorial