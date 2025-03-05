import java.util.*;
class Program8 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String xp=sc.next();
        int y=0;
        int count=0;
        for(int i=0;i<xp.length()-1;i++)
        {
            if(xp.charAt(i)=='0' && xp.charAt(i+1)=='1' && y <=xp.length())
            {
                y=i+1;
                while(xp.charAt(y)!='0')
                {
                    y++;
                }
                for(int x=i;x<=y;x++)
                {
                    System.out.print(xp.charAt(x));
                }
                System.out.println();
                count++;
                i=y-1;

            }
        }
        System.out.println("total: "+count);
        sc.close();
    }

}
