import java.util.Scanner;

public class Ej_50
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);	
		int		secreto = 73;
		boolean	correct = false;

		while (!correct)
		{
			int	num = Integer.parseInt(input.nextLine());
			if (num == secreto)
			{
				System.out.println("Numero correcto!!!");
				correct = true;
			}
			if (num < secreto)
				System.out.println("Mayor que: " + num);
			else if (num > secreto)
				System.out.println("Menor que: " + num);
		}
	}	
}
