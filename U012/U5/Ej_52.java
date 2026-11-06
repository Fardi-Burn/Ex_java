import java.util.Scanner;

public class Ej_52
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int	height = Integer.parseInt(input.nextLine());

		for (int i = 0; i < height; i++)
		{	
			System.out.printf(" ".repeat(height - i));
			System.out.printf("*".repeat(i));
			System.out.printf("*".repeat(i + 1));
	
			System.out.println();
		}

		input.close();
		return ;
	}
}
