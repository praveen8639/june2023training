import java.util.Scanner;
class PrintStarMultiple
{
public static void PrintStarMultiple(int i)
{
int k=1;
for(;k<=i;k=k+1)
System.out.println("*");
}
public static void main(String args[])
{
int j=5;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer to print * no.of times");
j=sc.nextInt();
PrintStarMultiple(j);
System.out.println("");
}
}
