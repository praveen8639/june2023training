import java.io.FileNotFoundException;
import java.io.PrintWriter;
class TryCatch9{
public static void main(String args[]){
PrintWriter pw;
try
{
pw= new PrintWriter("C:\\game\\a.txt");
pw.println();
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("File Saved Successfully");
}
}