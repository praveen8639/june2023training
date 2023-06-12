import java.io.*;
class BufferReader1{
public static void main(String args[])throws Exception{
{ 
//InputStreamReader,BufferedReader are built in methods in java.io.*
InputStreamReader r=new InputStreamReader(System.in);//syntax
BufferedReader br=new BufferedReader(r);//syntax
System.out.println("Enter your name");
String name=br.readLine();
System.out.println("Welcome:"+name);
}}}