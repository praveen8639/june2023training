import java.util.*;
public class Value
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println(" Enter a Character");
ch=sc.next().charAt(0);
int ascii_var = (int)ch;
System.out.println("ASCII of "+ ch + "is" + ascii_var);
}
}