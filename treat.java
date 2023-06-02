class A
{
public void TreatPraveen()
{
System.out.print("Treat called from praveen");
}
public void TreatPranav()
{
System.out.print("to pranav");
}
}
class B
{
public static void main(String args[])
{
A ob = new A();
ob.TreatPraveen();
ob.TreatPranav();
}
}
