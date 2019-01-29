
public class TestingArrays
{
	public static void main(String[] args)
	{
		double [ ] temperatures;
		
		temperatures = new double[3];
		
		temperatures[0] = 25.7;
		temperatures[1] = 30.09;
		temperatures[2] = 21.9;
		
		for (int pos = 0; pos < temperatures.length; pos++)
		{
			System.out.println("temperatures[" + pos + "] = " + temperatures[pos]);
		}
		System.out.println("\n********* Random Array *********");
		int randNumberArray [ ] = new int[10];
		for (int pos = 0; pos < randNumberArray.length; pos++)
		{
			randNumberArray[pos] = (int)(Math.random() * 101);
			System.out.println("randNumberArray[" + pos + "] = " + randNumberArray[pos]);
		}
		System.out.println("\n********* String Array *********");
		String names [ ] = new String[ ] {"Allan", "Kimesh", "Safwaan", "Ann", "Caroline", "David"};
		for (int pos = 0; pos < names.length; pos++)
		{
			System.out.println("names[" + pos + "] = " + names[pos]);
		}
	}
}
