import java.util.Vector;
class Vect1{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("Dog"); mammals.add("Horse");
mammals.add(2,"Cat");
Vector<String>animals=new Vector<>();
animals.add("Crocodile");
animals.addAll(mammals);
System.out.println("New Vector:"+animals);
}
}