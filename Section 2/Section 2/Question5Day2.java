public class Question5Day2
{
	public static void main(String[] args)
	{
		int rows = 0;
		int cols = 0;
		char ch = 'a';
		while(rows < 3)
		{
			while(cols < 3)
			{
				System.out.print(ch + "  ");
				ch++;
				cols++;
			}
			ch = 'a'; //reset ch
			cols = 0;//reset counter
			System.out.println();
			rows++;
		}
	}
}
