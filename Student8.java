class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
}//Student
class TestThis2
{
public static void main(String args[])
{
Student s1=new Student(1,"Praveen",65498);
Student s2=new Student(2,"Pranav",65864);
s1.display();
s2.display();
}
}