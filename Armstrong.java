import java.util.Scanner;
class Armstrong{
public static int lenDigit(int n){
int len=0;
while(n>0)
{
len++;n=n/10;}
return len;
}
public static void main(String args[])
{
System.out.println("Enter an integer to calculate its Amstrong number");
Scanner sc=new Scanner(System.in);
int inputNum=sc.nextInt();
System.out.println("Length:"+lenDigit(inputNum));
}}