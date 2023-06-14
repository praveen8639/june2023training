import java.util.*;
class Token2{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("My,name,is,Praveen");
System.out.println("Next token is: "+st.nextToken(","));
System.out.println("Next token is: "+st.nextToken(","));
System.out.println("Next token is: "+st.nextToken(","));
System.out.println("Next token is: "+st.nextToken(","));
}}