import java.util.*;

class Sentence
{

static int getSize(String str)
{
int c=0;
for(int i=0;i<str.length()-1;i++)
{
if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
{
c++;
}
}
return c;
}

static String sorted(String str)
{
char s[]=new char[str.length()];
for(int i=0;i<s.length;i++)
{
s[i]=str.charAt(i);
}

Arrays.sort(s);
str="";
for(int i=0;i<s.length;i++)
{
str+=s[i];
}
return str;

}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
str=" "+str+" "; 
int size=getSize(str);
String words[]=new String[size];
String word="";
int k=0;
for(int i=0;i<str.length()-1;i++)
{
if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
{
int x=i+1;
while(str.charAt(x)!=' ')
{
word+=str.charAt(x);
x++;
}
words[k]=word;
k++;
word="";
i=x-1;
}
}
for(int i=0;i<k;i++)
{
words[i]=sorted(words[i]);
}
Arrays.sort(words);
for(int i=0;i<k;i++)
{
System.out.print(words[i]+" ");
}
}
}