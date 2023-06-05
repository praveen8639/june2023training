import java.util.Scanner;
class HighDay5
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer"); 
i=sc.nextInt();
System.out.println("Enter an integer");
j=sc.nextInt();
if(i>j)
System.out.println("The max value is \t"+i);
else
System.out.println("The max value is \t"+j);
}
}
