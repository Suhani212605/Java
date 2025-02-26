import java.util.*;
public class treemap 
{
    public static void main(String arg[])
    {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(21,"Rose");
        tm.put(25,"Jack");
        tm.put(66,"Alice");
        tm.put(36,"Bob");
        System.out.println("The List of students are : "+tm);
        System.out.println("The student of Roll Number 21 is : "+tm.get(21));
        tm.remove(36);
        System.out.println("After removal of Roll Number 36 is : "+tm);
    }
}