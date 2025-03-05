package Student;

public class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentInfo() 
    {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age;
    }
}