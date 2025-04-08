import java.util.*;

class Q2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string 1");
String str = sc.nextLine();
System.out.println("enter string 2");
String st = sc.nextLine();
str=str.toLowerCase();
st=st.toLowerCase();
System.out.println(str);
int arr[][]=new int[26][2];

for(int i=0;i<26;i++)
{
arr[i][0]=0;
arr[i][1]=0;
}
for(int i=0;i<str.length();i++)
{
if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
{
arr[str.charAt(i)-'a'][0]++;
}
}
for(int i=0;i<st.length();i++)
{
if(st.charAt(i) >= 'a' && st.charAt(i)<='z')
{
arr[st.charAt(i)-'a'][1]++;
}
}

for(int i=0;i<26;i++)
{
if(arr[i][0]!=arr[i][1])
{
System.out.println("not anagram");
System.exit(0);
}
}
System.out.println("Anagram");
}
}