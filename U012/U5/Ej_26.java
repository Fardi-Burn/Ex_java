import java.util.Scanner;

public class Ej_26 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int	num;
		int	power;
		
		num = Integer.parseInt(input.nextLine());
		power = Integer.parseInt(input.nextLine());
		if (power < 1)
		{
			System.out.println("Error: Power number negative or zero");
			return ;
		}
		int temp = num;

		for (int i = 1; i < power; i++)
		{
			temp = temp * num;
		}
		System.out.println(temp);
	}
}
