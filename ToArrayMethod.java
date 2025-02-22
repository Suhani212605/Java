import java.util.ArrayList;
import java.util.Collections;
public class ToArrayMethod 
{
    public static void main(String arg[])
    {
            ArrayList<String> fruits=new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Bannana");
            fruits.add("Grapes");
            System.out.println("Fruits List : "+fruits);
            fruits.remove("Grapes");
            System.out.println("Fruits List after removing Grapes : "+fruits);
            Collections.sort(fruits);
            System.out.println("Fruits List after sorting : "+fruits);
            String[] fruitsArray=new String[fruits.size()];
            fruitsArray=fruits.toArray(fruitsArray);
            System.out.println("Fruits List in from of Array : ");
            for(String fruit : fruitsArray)
            {
                System.out.println(fruit);
            }
    }
}
