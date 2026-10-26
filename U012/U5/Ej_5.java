import java.util.Scanner;

public class Ej_5
{
	public static void main(String[] args)
	{
		int i = 0;
		Scanner input = new Scanner(System.in);

		while (Integer.parseInt(input.nextLine()) != 0)
		{
			System.out.println("Numero incorrecto");
			i++;
		}
		System.out.printf("Cantidad de numeros incorrecta %d%n", i);
		return ;

	}	
}
