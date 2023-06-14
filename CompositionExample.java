import java.util.*;
import java.io.*;
class College{
String name;
String address;
College(String name,String address)
{
this.name=name;
this.address=address;
}
}
class University{
private final List<College>college; 
University(List<College> colleges){
this.college =colleges;
}
public List<College>getToCollegesUniversity()
{
return college;
}
}
class CompositionExample{
public static void main(String args[])
{
College c1=new College (" MTIET College ","Palamaner");
College c2=new College (" MTIET College ","Palamaner");
College c3=new College (" IIT ","Kharkpur");
List<College>college=new ArrayList<College>();
college.add(c1); college.add(c2); college.add(c3);
University university=new University(college);
List<College>colleges=university.getToCollegesUniversity();
for(College cg:colleges){
System.out.println("Name :"+cg.name +" and " + " Address: "+cg.address);
}
}
}
