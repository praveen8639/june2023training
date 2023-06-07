class Animal
{
void eat()
{System.out.println("eating");}
}//Animal
class Dog extends Animal
{
void bark()
{System.out.println("barking");}
}//Dog
class TestInheitance
{
public static void main(String args[])
{
Dog d = new Dog();
        d.bark();
        d.eat();
}//main
}//testinheritance
