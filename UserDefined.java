import java.util.*;
class Student
{
    String name;
    int rollNo;
    public Student(String name,int rollNo)
{
    this.name=name;
    this.rollNo=rollNo;
}
public void display()
{
    System.out.println("Student Name : "+name+" And RollNO : "+rollNo);
}
}
public class UserDefined
{
    public static void main(String arg[])
    {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Alice",35));
        students.add(new Student("Bob",25));
        students.add(new Student("Rose",21));
        for(Student s : students)
        {
            s.display();
        }
    }
}