import java.util.Scanner;
class PrintPlusMinus
{
public static void PrintPlusMinus(int i,char ch)
{
int k;
for(k=1;k<=i;k=k+1)
System.out.print(ch);
}
public static void main(String args[])
{
int j=5;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer ");
j=sc.nextInt();
System.out.println("Enter an character ");
char ch=sc.next().charAt(0);
PrintPlusMinus(j,ch);
System.out.println(" ");
}
}