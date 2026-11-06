import java.util.Scanner;

public class Ej_47 
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
				if (num > 0 && num < 21)
				{
					System.out.println("It is a number between 1 and 20");
					accepted = true;
				}
				else
					System.out.println("Nota number between 1 and 20");
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
