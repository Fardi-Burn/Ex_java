import java.util.Scanner;

public class Ej_15 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserte numero:");
		num = Integer.parseInt(input.nextLine());

		for (int i = 0; i <= 12; i++)
		{
			System.out.printf("%d * %d = %d%n", num, i, num * i);
		}
		input.close();
	}	
}
