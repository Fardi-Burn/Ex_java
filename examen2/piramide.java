import java.util.Scanner;

class piramide
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		System.out.printf("Inserte altura de piramide: ");
		int	height = Integer.parseInt(input.nextLine());
		
		for (int i = 0; i < height; i++)
		{
			if (i % 2 == 0)
			{
				for (int j = 1; j <= i + 1; j++)
				{
					System.out.print(j);
				}
			}
			else
				System.err.print("*".repeat(i + 1));
			System.out.println();
		}

		input.close();
		return ;
	}
}