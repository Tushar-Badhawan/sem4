import java.util.*;

class Q1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the base string");
String str=sc.nextLine();
System.out.println("enter the index to add new string");
int x=sc.nextInt();
sc.nextLine();
System.out.println("enter the new string");
String s=sc.nextLine();

String p1="",p2="";
for(int i=0;i<x;i++)
{
p1+=str.charAt(i);
}
for(int i=x;i<str.length();i++)
{
p2+=str.charAt(i);
}

str=p1+""+s+""+p2;
System.out.println("new string: "+str);

}
}