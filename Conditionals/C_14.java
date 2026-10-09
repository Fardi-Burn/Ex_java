import java.util.Scanner;

public class C_14
{
	static public void main(String argv[])
	{
		Scanner	input = new Scanner(System.in);
		String	str;
		str = input.nextLine();

		if (str.equalsIgnoreCase("continuar"))
			System.out.println("Correct!!!");
		else
			System.out.println("Incorrect!!!");
		input.close();
		return ;
	}
}
