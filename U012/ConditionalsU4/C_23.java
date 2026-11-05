import java.util.Scanner;

public class C_23
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Elige una estacion 1 al 4");

		int	valor = Integer.parseInt(input.nextLine());
		String estacion = switch(valor)
		{
			case 1 -> "Primavera";
			case 2 -> "Verano";
			case 3 -> "Otoño";
			case 4 -> "Invierno";
			default -> "No coincide";
		};

		System.out.printf("%s%n", estacion);
		input.close();
		return ;
	}
}
