import java.util.*;

abstract class Temperature
{
    double temp;

    void setTempData(double val)
    {
        this.temp=val;
    }
    abstract void changetemp();
}

class Fahrenheit extends Temperature
{
    double ctemp;
    
    void changetemp()
    {
        ctemp=(5.0/9)*(temp-32);
        System.out.println("temperature in celsius: "+ctemp);
    }
}

class Celsius extends Temperature
{
    double ftemp;
    void changetemp()
    {
        ftemp=(temp*9.0/5)+32;
        System.out.println("temperature in fahrenheit: "+ftemp);

    }
}

class Program13
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Temperature t;

        double temp;

        while(true)
        {
            System.out.println("enter the temperature");
            temp=sc.nextDouble();
            int c;
            System.out.println("enter choice");
            c=sc.nextInt();

            if(c==1)
            {
                t=new Fahrenheit();
                t.setTempData(temp);
                t.changetemp();
            }
            if(c==2)
            {
                t=new Celsius();
                t.setTempData(temp);
                t.changetemp();
            }
            if(c==0)
            {
                break;
            }

            else 
            {
                System.out.println("enter correct choice");
            }
        }


    }


}