class TryCatchMultipleBlock14{
public static void main(String args[]){
try
{
int a[]=new int[5];
a[5]=30/0;
}
catch(Exception e)
{
System.out.println("common task completed");
}
catch(ArithmeticException e)
{
System.out.println("task1 is completed");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Index Out Of Bounds Exception occurs ");
} 
System.out.println("Rest of the code");
}
}