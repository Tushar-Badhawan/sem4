import java.util.*;

class Q3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();

char s[]=new char[str.length()];
for(int i=0;i<str.length();i++)
{
s[i]=str.charAt(i);
}
for(int i=0;i<str.length();i++)
{
for(int j=0;j<str.length()-i-1;j++)
{
 if(s[j] > s[j+1])
{
char temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
str="";
for(int i=0;i<s.length;i++)
{
str+=s[i];
}
System.out.println(str);
}
}