import java.util.*;

class MyCalculator
{
    int n, p;

    MyCalculator(int n, int p)
    {
        this.n = n;
        this.p = p;
    }
    void checkNegative() throws Exception
    {
        if(n<0)
        {
            throw new Exception("Base cannot be negative");
        }

        if(p<0)
        {
            throw new Exception("Power cannot be negative");
        }
        if(n==0 && p==0)
        {
            throw new Exception("both Power and Base cannot be zero");
        }
    }
    double power()
    {
        return Math.pow(n, p);
    }
}
class Program17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int n = sc.nextInt();
        System.out.println("Enter the power:");
        int p = sc.nextInt();
        MyCalculator c = new MyCalculator(n, p);
        try
        {
            c.checkNegative();
            System.out.println("Result: " + c.power());
        }
        catch(Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
