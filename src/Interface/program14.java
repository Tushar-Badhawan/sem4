import java.util.*;

interface Volume
{
    void display();
}

class Cone implements Volume
{
    double r,h;

    Cone(double r, double h)
    {
        this.r=r;
        this.h=h;
    }

    public void display()
    {
        double v= (1.0/3)*(22.0/7)*Math.pow(r,2)*h;
        System.out.println("volume of cone: "+v);
    }
}

class Hemisphere
{
    double r;

    Hemisphere(double r)
    {
        this.r=r;
    }
    public void display()
    {
        double v= (2.0/3)*(22.0/7)*Math.pow(r,3);
        System.out.println("volume of Hemisphere: "+v);
    }


}

class Cylinder
{
    double r,h;

    Cylinder(double r, double h)
    {
        this.r=r;
        this.h=h;
    }

    public void display()
    {
        double v=(22.0/7)*Math.pow(r,2)*h;
        System.out.println("volume of Cylinder: "+v);
    }
}

class Program14 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r,h;

        while (true)
        {
            int c;
            System.out.println("enter the choice");
            c=sc.nextInt();
            
            if(c==1)
            {
                
                System.out.println("enter the radius of cone");
                r=sc.nextDouble();
                System.out.println("enter the height of cone");
                h=sc.nextDouble();

                Cone cone = new Cone(r, h);
                cone.display();
            }
            if(c==2)
            {
                
                System.out.println("enter the radius of hemisphere");
                r=sc.nextDouble();

                Hemisphere hemisphere = new Hemisphere(r);
                hemisphere.display();
            }

            if(c==3)
            {
                System.out.println("enter the radius of cylinder");
                r=sc.nextDouble();
                System.out.println("enter the height of cylinder");
                h=sc.nextDouble();

                Cylinder cylinder = new Cylinder(r, h);
                cylinder.display();
            }
            if(c==0)
            {
                break;
            }

            else{
                System.out.println("enter correct choice");
            }
        }

    }
}
