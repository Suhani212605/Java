import java.util.*;
public class MultiplesAndSort
{
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter lower bound : ");
		int lowerBound=scanner.nextInt();
		System.out.println("Enter upper bound : ");
		int upperBound=scanner.nextInt();
		ArrayList<Integer> mults=new ArrayList<>();
		Random random=new Random();
		for(int i=0;i<100;i++)
		{
		    int number=random.nextInt(upperBound-lowerBound+1)+lowerBound;
		    if(number%2==0 && number%5==0)
		    {
		        mults.add(number);
		    }
		}
		System.out.println("Multiples of 2 and 5 : "+mults);
		Collections.sort(mults,new Comparator<Integer>()
		{
		    @Override
		    public int compare(Integer num1,Integer num2)
		    {
		        return ((num1/10)%10)-((num2/10)%10); 
		    }
		});
		System.out.println("Sorted by tens places : "+mults);
		scanner.close();
	}
}