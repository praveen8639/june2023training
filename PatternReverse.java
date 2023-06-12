import java.util.Scanner;
class  PatternReverse{
public static void printLine(int n){
for(int i=1;i<=n;i++){System.out.print(i);}
}//class 
public static void printPattern(int n)
{
for(int i=n;i>=1;i--){System.out.print("\n");printLine(i);}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an intger");
int n=sc.nextInt();
printPattern(n);
}//main
}
