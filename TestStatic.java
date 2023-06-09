class Student
{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class TestStatic
{
public static void main(String args[])
{
Student s1=new Student (1,"Praveen");
Student s2=new Student (2,"Pranav");
Student.college="MTIET";
s1.display();
s2.display();
}
}

