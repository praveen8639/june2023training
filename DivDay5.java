import java.util.Scanner;
class DivDay5
{
public static void main(String args[])
{
int i,j=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer"); 
i=sc.nextInt();
System.out.println("Enter an integer");
j=sc.nextInt();
if(j==0)
System.out.println("Division error");
else
System.out.println(i+ "  divided by  "  +j+  " is "+(i/j));
i=i+j;
}
}