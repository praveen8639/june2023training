class TryCatchMultipleBlock12{
public static void main(String args[]){
int a[]=new int[5];
a[0]=11;a[1]=0;a[3]=33;a[4]=44;
try
{
for(int i=0;i<=5;i++)
System.out.println(100/a[i]);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Index Out Of Bounds Exception occurs ");
} 
catch(Exception e)
{
System.out.println("Parent Exception Occurs");
}
System.out.println("Rest of the code");
}
}