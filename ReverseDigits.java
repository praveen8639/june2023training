import java.util.Scanner;
class ReverseDigits {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n;
String rs="";
System.out.println("Enter any String :");
n=sc.nextInt();
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
  }
}