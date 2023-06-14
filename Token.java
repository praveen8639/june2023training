import java.util.StringTokenizer;
class Token{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("My name is Praveen"," ");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}}