import java.util.Scanner;
class ExtractDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any data");
String res="";
String strobj=sc.nextLine();
for(int i=0;i<strobj.length();i++)
{
if(strobj.charAt(i)>='0'&& strobj.charAt(i)<='9')
res=res+strobj.charAt(i);
}
System.out.println(res);
}
}