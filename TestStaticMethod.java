class Student
{
int rollno;
String name;
static String college="MTIET";
static void change()
{
college="IIT";
}
Student(int r,String n)
{
rollno = r;
name = n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class TestStaticMethod
{
public static void main(String args[])
{
Student s1=new Student(1,"Praveen");
Student s2=new Student(2,"Pranav");
Student s3=new Student(3,"Varun");
s1.display();
s2.display();
s3.display();
}
}
