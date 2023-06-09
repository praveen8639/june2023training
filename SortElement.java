import java.util.*;
import java.util.Arrays;
class SortElement
{
public static void main(String args[])
{
int n,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of elements you want in an array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elememts");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();}
//coding for array sorting
Arrays.sort(a);
//display array
for(i=0;i>=n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int j : a)
System.out.print(j+"\t");
}//for
}