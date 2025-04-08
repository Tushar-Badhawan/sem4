import java.util.*;
class SortQ3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String s=sc.nextLine();
char s1[]=new char[s.length()];
for(int i=0;i<s1.length;i++)
{
s1[i]=s.charAt(i);
}
Arrays.sort(s1);
s="";
for(int i=0;i<s1.length;i++)
{
s+=s1[i];
}
System.out.println(s);
}
}