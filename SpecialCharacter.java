import java.util.*;
public class SpecialCharacter
{
public static void main(String args[])
{
System.out.println("Enter a  Character");
Scanner sc= new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')|| (ch>='0'&& ch<='9'))
System.out.println(ch+"is not a Special Character ");
else
System.out.println(ch+"is a Special Character ");

}
}