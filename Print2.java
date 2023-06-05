import java.util.Scanner;
class Print2
{
public static void main(String args[])
{
int stop;
int res=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer to stop the sum");
stop=sc.nextInt();
System.out.print("The sum is");
for(int i=0;i<=stop;i++)
{
res=res+i;
}
System.out.print(res);
}
}
