class Main1
{
public static void main(String args[])
{
int[] numbers={2,-9,0,5,12,-25,23,9,8,12};
int sum=0;
Double average;
for(int number  : numbers)
{
sum += number;
}
int arrayLength = numbers.length;
average = ((double)sum/(double)arrayLength);
System.out.println("sum ="+sum);
System.out.println("Average ="+average);
}
}