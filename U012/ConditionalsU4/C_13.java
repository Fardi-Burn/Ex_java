import	java.util.Scanner;

public class C_13
{
	static public void main(String argv[])
	{
		Scanner	input = new Scanner(System.in);
		String	str;
		str = input.nextLine();
		if (str.equals("delta42"))
			System.out.println("It is delta42!!!");
		else
			System.out.println("Wrong input!!!");
		input.close();
		return ;
	}
}
