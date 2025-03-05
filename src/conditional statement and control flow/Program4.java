import java.util.*;
class Program4
{
public static void main(String args[])
{	
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
//System.out.println("entered number is: "+n);
//String s=n+"";
//s=s.replace('0','1');
//n=Integer.parseInt(s);
int r;
int sum=0;
while(n>0)
{
r=n%10;
if(r==0)
{
r=1;	
}
sum=(sum*10)+r;
n=n/10;
}
while(sum>0)
{
r=sum%10;
n=(n*10)+r;
sum=sum/10;
}
System.out.println("number modified: "+n);
}
}