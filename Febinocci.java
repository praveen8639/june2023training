import java.util.Scanner;
class Febinocci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0;
int a=0;
int n,b=1;
System.out.println("Enter an integer");
n=sc.nextInt();
System.out.println("Fiebinocci series :");
while(sum <=n){
System.out.print(sum+"\t");
a=b;
b=sum;
sum=a+b;
}
}
}