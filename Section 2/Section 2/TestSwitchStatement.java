
public class TestSwitchStatement
{
	public static void main(String[] args)
	{
		int a = 2;
		char ch = 'y';
		String name = "Ann";
		
		System.out.println("Statement before the first switch statement..>>");
		switch(a) //comparing a to constants in the switch block
		{
			case 1 : 	System.out.println("a has the value 1");
						double d = 33.876, d2 = 44, d3 = 88.77;
						if(d > 40)
						{
							System.out.println("d is greater than 40");
							//Notice the nested if else.
							if(d2 < d3)
							{
								System.out.println("d2 is less than d3");
							}
							else
							{
								System.out.println("d2 is greater than d3");
							}
						}
						break;
			case 2 : 	System.out.println("a has the value 2");
						break;
			case 3 : 	System.out.println("a has the value 3");
						break;
			default :	System.out.println("a does not have the values 1,2, or 3");
		}
		
		System.out.println("Statement after the first switch statement..>>");
		switch(ch) //comparing a to constants in the switch block
		{
			case 'x' : 	System.out.println("ch has the value x");
						break;
			case 'y' : 	System.out.println("ch has the value y");
						break;
			case 'z' : 	System.out.println("ch has the value z");
						break;
		}
		System.out.println("Statement after the second switch statement..>>");
		switch(name) //comparing a to constants in the switch block
		{
			case "Greg" 	: 	System.out.println("name has the value Greg");
								break;
			case "Imraan" 	: 	System.out.println("name has the value Imraan");
								break;
			case "Ann" 		: 	System.out.println("name has the value Ann");
								break;
		}
	}
}
