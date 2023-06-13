import java.util.*;
class RollNumberDoesException extends Exception
{
int a;
int b=90;
int msg;
RollNumberDoesException(int msg){
this.msg=msg;

 String toString(){
return msg;
}
}
class RollNumber
{
public static void main(String args[])
{
System.out.println("Enter your Roll Number:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
try
{
 if(a<=90)
 {
throw new  RollNumberDoesException("Entered Roll number exist");
 }
 else
 {
 System.out.println("Entered Roll Number  does not exist ");
 }
}//try
catch(RollNumberDoesException ex)
{
System.out.println(ex.getMessage());
}
}
}
}


