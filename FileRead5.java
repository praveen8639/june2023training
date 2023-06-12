import java.io.*;
class FileRead5
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\game\\b.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countConsonant=0;
while((i=br.read())!=-1)
{
if( (char)i!='a'&&(char)i!='e'&&(char)i!='i'&&(char)i!='o'&&(char)i!='u'&&(char)i!='A'&&(char)i!='E'&&(char)i!='I'&&(char)i!='O'&&(char)i!='U')  
{
countConsonant++;}
}
System.out.println(countConsonant);
br.close();
fr.close();
}
}