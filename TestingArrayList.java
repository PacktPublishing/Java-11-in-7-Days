import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestingArrayList
{
	public static void main(String[] args)
	{
		ArrayList list_One;
		
		list_One = new ArrayList();
		
		list_One.add(Integer.valueOf(99));
		list_One.add(new String("Hello World"));
		list_One.add(new Date());
		
		for (int pos = 0; pos < list_One.size(); pos++)
		{
			Object obj = list_One.get(pos)
					;
			System.out.println(obj.toString());
		}
		
		System.out.println("\n************ ArrayList of String Objects ***********");
		ArrayList<String> nameList;
		
		nameList = new ArrayList<String>();
		nameList.add("Dave");
		nameList.add("Ravi");
		//nameList.add(new Date());
		nameList.add("Cynthia");
		nameList.add("Charles");
		nameList.add("Virat");
		nameList.add("Ishant");
		
		
		for (int pos = 0; pos < nameList.size(); pos++)
		{
			String name = nameList.get(pos);
			System.out.println("name = " + name);
		}
		
		System.out.println("\n************ Other Methods of ArrayList ***********");
		
		boolean contains = nameList.contains("Ravi");
		System.out.println("Does nameList contain Ravi? " + contains);
		
		nameList.add(3, "Michael");
		
		System.out.println("Name at position 3 = " + nameList.get(3));
	}
}
