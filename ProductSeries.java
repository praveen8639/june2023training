import java.util.Scanner;
class ProductSeries
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
int res=1;
System.out.println("Enter any Psitive integer");
num =sc.nextInt();
for(int i=1;i<=num;i++)
{
res*=i;
System.out.println("Factorial:"+res);
}
}
}