import java.util.*;
import java.util.Comparator;
class Student
{
    String name;
    int marks;
    public Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public String toString()
    {
        return name+" - "+marks;
    }
}
public class ComparatorExample 
{
    public static void main(String arg[])
    {
        ArrayList<Student> students=new ArrayList<>();
    students.add(new Student("Rose",21));
    students.add(new Student("Bob",16));
    students.add(new Student("Jack",25));
    students.sort(new Comparator<Student>()
    {
        public int compare(Student s1,Student s2)
        {
            return s1.marks-s2.marks;
        }
    });
    for(Student s : students)
    {
        System.out.println(s);
    }
    }
}
