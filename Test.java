import java.io.*;
import java.util.*;
class Test
{
static boolean isNumber(String s)
{
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))==false)
{return false;}
}
return true;
}
public static void main(String args[])
{ 
System.out.println("Enter Integer or String");
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(isNumber(str))
System.out.println("Integer");
else
System.out.println("String");
}
}