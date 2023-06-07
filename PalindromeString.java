import java.util.Scanner;
class PalindromeString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any String");
String strobj=sc.nextLine();
strobj=strobj.toLowerCase();
String rev="";
for(int i= strobj.length()-1;i>=0;i--){rev=rev+strobj.charAt(i);}
//System.out.println(strobj+""+rev)
if(strobj.equals(rev))
{
System.out.println("yes");
}
else
{
System.out.println("No");
}
}
}