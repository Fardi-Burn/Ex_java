import java.util.Scanner;

public class Ej_18
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Insert 1 temp");
		int	temp_1 = Integer.parseInt(input.nextLine());
		System.out.println("Insert 2 temp");
		int	temp_2 = Integer.parseInt(input.nextLine());
		System.out.println("Insert 3 temp");
		int	temp_3 = Integer.parseInt(input.nextLine());
		System.out.println("Insert 4 temp");
		int	temp_4 = Integer.parseInt(input.nextLine());
		System.out.println("Insert 5 temp");
		int	temp_5 = Integer.parseInt(input.nextLine());
		System.out.println("Insert 6 temp");
		int	temp_6 = Integer.parseInt(input.nextLine());

		int mediam = (temp_1 + temp_2 + temp_3 + temp_4 + temp_5 + temp_6) / 6;

		System.out.println("The mediam is " + mediam);
		input.close();
		return ;
	}	
}
