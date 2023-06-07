import java.util.Scanner;
class CapitalToSmall
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any string");
String strobj=sc.nextLine();
//strobj=strobj.toLowerCase();
String temp="";
int ascii;
for(int i=0;i<=strobj.length()-1;i++)
{
if(strobj.charAt(i)>='A'&& strobj.charAt(i)<='Z')
{
ascii=strobj.charAt(i);
ascii +=32;
temp=temp+(char)ascii;
}
else
{
temp=temp+strobj.charAt(i);
}
}
System.out.println("temp:"+temp);
strobj=temp;
String rev="";
for(int i=strobj.length()-1;i>=0;i--)
{rev = rev+strobj.charAt(i);}
//System.out.print(strobj+""+rev);
if(strobj.equals(rev))
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}