import java.util.Scanner;

public class C_26
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int edad;
		double precio;

		edad = Integer.parseInt(input.nextLine());
		if (edad <= 0)
		{
			System.out.println("error edad negativa");
			input.close();
			return ;
		}
		if (edad < 4)
			precio = 0;
		else if (edad < 15)
			precio = 4;
		else if (edad < 64)
			precio = 9;
		else
			precio = 5;

		System.out.printf("Precio entrada: %.2f", precio);
		input.close();
		return ;
	}	
}
