import java.util.Scanner;

public class Ej_33
{
	public static void main(String[] args) 
	{
		int	h;
		Scanner	input = new Scanner(System.in);

		System.out.println("Insert height");
		h = Integer.parseInt(input.nextLine());
		
		for (int i = h; i > 0; i--)
		{
			System.out.printf("+".repeat(i));
			System.out.println();
		}
		
		input.close();
		return ;
	}	
}
