import java.util.List;
import java.util.List;
class Main5{
public static void main(String args[]){
List<Integer>numbers=new List<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+numbers);
int removedNumber=numbers.remove(1);
System.out.println("Removed Elements:"+removedNumber);
System.out.println("List:"+numbers);
}
}
