import java.util.Scanner;

public class C_38
{
	public static void main(String[] args)
	{
		int 	num_horas;
		double	precio;

		Scanner input = new Scanner(System.in);
		num_horas = Integer.parseInt(input.nextLine());
		if (num_horas <= 0)
		{
			System.out.println("Error");
			input.close();
			return ;
		}
		else if (num_horas == 1)
		{
			precio = 2.5;
		}
		else if (num_horas < 4)
		{
			precio = 1.75 * num_horas;
		}
		else
		{
			precio = 1.20 * num_horas;
		}
		System.out.printf("%.2f %n", precio);
		input.close();
		return ;
	}
}
