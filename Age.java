import java.util.*;
class AgeDoesNotFitException extends Exception{
String msg;
AgeDoesNotFitException(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Age{
public static void main(String args[]){
System.out.println("Enter your age:");
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try{
if(age<18)
{
throw new AgeDoesNotFitException("Entered age doesnot full fill the requirements");
}
else
{
System.out.println("Entered age  full fills the requirements ");
}
}
catch(AgeDoesNotFitException ex){
System.out.println(ex.getMessage());
}
}
}

