import java.util.StringTokenizer;
class Token3{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Demonstrating methods from StringTokenizer");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}