import java.util.Scanner;
class TestDay4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int inc=sc.nextInt();
String str="";
for(int i=0;i<=num;i=i+inc)
{
System.out.println("old value of str:"+str+"value of i:"+i);
str=str+i+",";
System.out.println("updated value of str;"+str);
}
for(int i=0;i<str.length()-1;i++)System.out.print(str.charAt(i));
}
}