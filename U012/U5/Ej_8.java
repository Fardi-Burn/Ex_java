import java.util.Scanner;

public class Ej_8
{
	public static void main(String[] args)
	{
		String temp;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.println("inserte contrasena:");
			temp = input.nextLine();

		} while (!temp.equals("delta42"));
		input.close();
		return ;
	}
}
