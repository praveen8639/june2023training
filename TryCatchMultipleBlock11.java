class TryCatchMultipleBlock11{
public static void main(String args[]){
try
{
int a[]=new int[5];
System.out.println(a[10]);
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