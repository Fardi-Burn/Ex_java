import java.util.Scanner;

public class Ej_29
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int	num;
		int div = 0;
		
		num = Integer.parseInt(input.nextLine());
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
				div++;
		}
		if (div == 2)
			System.out.println("Primo");
		else
			System.out.println("Compuesto");
		input.close();
		return ;	
	}	
}
