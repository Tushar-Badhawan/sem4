import Course.Course;
import Enrollment.Enrollment;
import Student.Student;
import java.util.*;

class Program15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter name of student");
        String name=sc.nextLine();
        System.out.println("enter your student id");
        String studentId=sc.nextLine();
        System.out.println("enter your age");
        int age=sc.nextInt();
        
        Student s1=new Student(studentId,name,age);
        sc.nextLine();
        System.out.println("enter name of Course");
        String name1=sc.nextLine();
        System.out.println("enter Course id");
        String courseId=sc.nextLine();
        System.out.println("enter credits");
        int credit=sc.nextInt();

        Course c1=new Course(courseId,name1,credit);

        Enrollment e= new Enrollment(s1,c1);

        System.out.println(e.getEnrollmentInfo());
    }
}