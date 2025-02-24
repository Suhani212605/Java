import java.util.TreeMap;
import java.util.Map;
public class maps
{
    public static void main(String arg[])
    {
        Map<Integer,String> ft=new TreeMap<>();
        ft.put(1,"Apple");
        ft.put(2,"Orange");
        ft.put(3,"Bannana");
        ft.put(4,"Watermellon");
        System.out.println("Fruits : "+ft);
        System.out.println("3rd value of fruits Array : "+ft.get(3));
        ft.remove(3);
        System.out.println("After deleating 3rd value : "+ft);
    }
}