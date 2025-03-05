package Enrollment;

import Student.Student;
import Course.Course;

public class Enrollment 
{
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course)
    {
        this.student = student;
        this.course = course;
    }

    public String getEnrollmentInfo() {
        return student.getStudentInfo() + " enrolled in Course\n" + course.getCourseInfo();
    }
}