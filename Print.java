import java.util.Scanner;
class Print
{
public static void main(String args[])
{
int counter;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer");
counter=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.print(i+ "i++");
counter =counter + 1;
}
}
}
