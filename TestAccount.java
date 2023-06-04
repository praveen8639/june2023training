class Account{ 
int accno;
String name;
float amount;
void insert(int a,String n,float amt){
accno=a;
name=n;
amount=amt;
}
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+"\tdeposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println("Insufficient Funds");
}
else{
amount=amount-amt;
System.out.println(amt+"\twithdraw");
}
}
void checkBalance(){System.out.println("Balance is: \t"+amount);}
void display(){System.out.println(accno+"\t"+name+"\t"+amount);}
}
class TestAccount{
public static void main(String args[])
{
Account a1=new Account();
a1.insert(832345,"Praveen",1000);
a1.display();
a1.checkBalance();
a1.deposit(4000);
a1.checkBalance();
a1.withdraw(1500);
a1.checkBalance();
}
}



