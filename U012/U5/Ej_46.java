import java.util.Scanner;

public class Ej_46 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int	num;
		boolean	accepted = false;

		while (!accepted)
		{

			if (input.hasNextInt())
			{
				num = input.nextInt();
				System.out.println("It is a number");
				accepted = true;
			}
			else 
			{
				System.out.println("Not a number");
				input.next();
			}
		}

		input.close();
		return ;
	}	
}
