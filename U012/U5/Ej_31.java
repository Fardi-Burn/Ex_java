import java.util.Scanner;

public class Ej_31 
{
	public static void main(String[] args) 
	{
		int col;
		int	row;
		Scanner	input = new Scanner(System.in);

		System.out.println("Insert col");
		col = Integer.parseInt(input.nextLine());
		System.out.println("Insert row");
		row = Integer.parseInt(input.nextLine());

		if (col == 0 || row == 0)
			return ;
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				System.out.printf("#");
			}
			System.out.printf("%n");
		}
	}	
}
