import java.io.CharArrayWriter;
import java.io.FileWriter;
class CharArrayWriter1
{
public static void main (String args[]) throws Exception
{
{
CharArrayWriter out =new CharArrayWriter();
out.write("Welcome to training");
FileWriter f1=new FileWriter("C:\\game\\a.txt");
FileWriter f2=new FileWriter("C:\\game\\b.txt");
FileWriter f3=new FileWriter("C:\\game\\c.txt");
FileWriter f4=new FileWriter("C:\\game\\d.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();
System.out.println("Success");
}
}
}
