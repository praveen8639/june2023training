import java.util.*;
class SortElement_DecendingOrder
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of elements you want in array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int x:a){System.out.print(x+"\t");}
}
}