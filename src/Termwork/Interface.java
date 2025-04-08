import java.util.*;

interface Volume
{
void calculate();
void show();
}

class Sphere implements Volume
{
double r;
double vol;
Sphere(double r)
{
this.r=r;
}
public void calculate()
{
vol=(4.0/3.0)*(3.14)*Math.pow(r,3);
}

public void show()
{
System.out.println("volume of sphere is: "+vol);
}
}

class Cylinder implements Volume
{
double r;
double h;
double vol;
Cylinder(double r,double h)
{
this.r=r;
this.h=h;
}
public void calculate()
{
vol=(3.14)*Math.pow(r,2)*h;
}

//public void show()
//{
//System.out.println("volume of cylinder is: "+vol);
//}
}

class Interface
{
public static void main(String args[])
{
Sphere s=new Sphere(10);
Cylinder c=new Cylinder(10,10);

s.calculate();
s.show();
c.calculate();
c.show();
}
}