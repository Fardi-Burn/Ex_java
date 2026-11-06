import java.util.Scanner;

public class Ej_45 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int a = Integer.parseInt(input.nextLine());
		int b = Integer.parseInt(input.nextLine());

		while (b != 0)
		{
			int resto = a % b;
			a = b;
			b = resto;
		}

		System.out.println(a);
	}
}
