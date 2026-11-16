import java.util.Scanner;

public class PiramideInversa 
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		
		System.out.printf("Inserte altura piramide: ");
		int height = Integer.parseInt(input.nextLine());


		// Piramide inversa

		// for (int i = 1; i <= height; i++)
		// {
		// 	System.out.printf(" ".repeat(i));
		// 	System.out.printf("*".repeat(height - (i - 1)));
		// 	System.out.printf("*".repeat(height - i));
		// 	System.out.println();
		// }



		// Piramide inversa diferentes caracteres

		// char simbol[] = new char[2];
		// simbol[0] = '*';
		// simbol[1] = '#';
		// int		sim_val = 0;
		// for (int i = 0; i < height; i++)
		// {
		// 	System.out.print(" ".repeat(i));
		// 	for (int j = i; j < height; j++)
		// 	{
		// 		System.out.print(simbol[sim_val]);
		// 		if (sim_val == 1)
		// 			sim_val = 0;
		// 		else
		// 			sim_val = 1;
		// 	}
		// 	for (int y = i + 1; y < height; y++)
		// 	{
		// 					System.out.print(simbol[sim_val]);
		// 		if (sim_val == 1)
		// 			sim_val = 0;
		// 		else
		// 			sim_val = 1;
		// 	}
		// 	System.out.println();
		// }

		// Piramide inversa numeros

		// for (int i = 0; i < height; i++)
		// {
		// 	System.out.print(" ".repeat(i));
		// 	int x = 1;
		// 	for (int j = i; j < height; j++)
		// 	{
		// 		System.out.print(x);
		// 		x++;
		// 	}
		// 	System.out.println();
		// }

		// Piramide inversa vacia

		for (int i = 0; i < height; i++)
		{
			if (i == 0)
				System.out.print("*".repeat(height));
			else if (i == height - 1)
			{
				System.out.print(" ".repeat(i));
				System.out.print("*".repeat(1));
			}
			else
			{
				System.out.print(" ".repeat(i));
				System.out.print("*".repeat(1));
				System.out.print(" ".repeat(height - i - 2));
				System.out.print("*".repeat(1));
			}
			System.out.println();
		}
		

		input.close();
		return ;
	}	
}
