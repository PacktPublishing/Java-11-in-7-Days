
public class TestingIfAndIfElse
{

	public static void main(String[] args)
	{
		//variable declarations and initializations 
		int a = 10, b = 3, answer = 0;
		
		System.out.println("Statement before the first if statement..>>");
		if(a == 10)
		{
			System.out.println("in if(a == 10) block....>>>>");
			System.out.println("a does equal 10....>>>>");
		}
		System.out.println("Statement after the first if statement..>>");
		System.out.println("b equals " + b);
		
		b++;//Increments b by 1 remember.
		
		System.out.println("b now equals " + b);
		answer = a + b;
		if(answer == 13)
		{
			System.out.println("in if(answer == 13) block....>>>>");
			System.out.println("answer does equal 13....>>>>");
		}
		else//this else is married to the if above
		{
			System.out.println("in else(answer == 13) block....>>>>");
			System.out.println("answer does not equal 13....>>>>");	
			System.out.println("answer does equal " + answer);
		}
		System.out.println("Statement after the if/else statement..>>");
	}
}
