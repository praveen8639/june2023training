import java.io.*;
import java.util.*;
static boolean isNumber(String s)
{
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))==false)
return false;
}
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(isNumber(str))
System.out.println("Integer");
else
System.oit.println("String");
}
}
