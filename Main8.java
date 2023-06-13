import java.util.ArrayList;
class Main8{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
languages.add("java");
languages.add("Python");
languages.add("Cpp");
System.out.println("ArrayList:"+languages);
languages.set(2,"JavaScript");
System.out.println("Modified ArrayList:"+languages);
}
}