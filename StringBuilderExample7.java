class StringBuilderExample7{
public static void main(String args[]){
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());
sb.append("Hello");
System.out.println(sb.capacity());
sb.append("Java is my favourite language");
System.out.println(sb.capacity());
sb.append(10);
System.out.println(sb.capacity());
sb.append(50);
System.out.println(sb.capacity());
}
}