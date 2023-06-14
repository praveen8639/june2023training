import java.util.StringTokenizer;
class Token4{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Demonstrating methods from StringTokenizer");
while(st.hasMoreElements())
{
System.out.println(st.nextToken());
}
}
}