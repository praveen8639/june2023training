import java.util.Scanner;
class CountFactors
{
public static void main(String args[])
{
System.out.println("Enter an integer to find its factors");
Scanner sc=new Scanner(System.in);
int inputNum=sc.nextInt();
int count=0;
for(int i=1;i<=inputNum;i++)
{
if(inputNum%i==0)
{
System.out.print(i);
count++;
if(i!=inputNum)System.out.print(",");
}
}
System.out.println("\ncount of factors of " +inputNum+ " is " +count);
}
}





