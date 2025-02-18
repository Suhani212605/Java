# Java program about collections
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args)
	{
		
        ArrayList<String> a1=new ArrayList<>();
        a1.add("Apple");
        a1.add("Oragne");
        System.out.println("Array is : "+a1);
        a1.add(1,"Bannana");
        System.out.println("After adding bannana : "+a1);
        a1.remove(0);
        System.out.println("After removing 0th index element : "+a1);
    }
}
Output : 
![image](https://github.com/user-attachments/assets/478c8898-fcd2-4f58-bd14-0fcc7d6b022a)
