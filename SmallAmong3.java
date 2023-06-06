import java.util.Scanner;
class SmallAmong3
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter an Integer :");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Enter an Integer :");
b=sc.nextInt();
System.out.println("Enter an Integer :");
c=sc.nextInt();
if((a<b)&&(a<c))
{
System.out.println("The Smallest integer is "+a);
}
if((b<c)&&(b<a))
{
System.out.println("The Smallest integer is "+b);
}
if((c<a)&&(c<b))
{
System.out.println("The Smallest integer is "+c);
}
}
}







