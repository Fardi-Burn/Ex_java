import java.util.Scanner;

public class Ej_32
{
	public static void main(String[] args)
	{
		int	h;
		Scanner	input = new Scanner(System.in);

		System.out.println("Insert height");
		h = Integer.parseInt(input.nextLine());
		
		for (int i = 0; i <= h; i++)
		{
			System.out.printf("+".repeat(i));
			System.out.println();
		}
		input.close();
		return ;
	}
}
