import java.util.Scanner;

public class C_40
{
	public static void main(String[] args)
	{
		final int CODIGO_CORRECTO = 2466;
		double	saldo = 750.0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserte codigo:");
		int	temp = Integer.parseInt(input.nextLine());
		if (temp != CODIGO_CORRECTO)
		{
			System.out.println("Acceso denegado");
			input.close();
			return ;
		}
		temp = 0;
		System.out.println("""
				========================
       OPERACIONES
========================
1. Consultar saldo
2. Retirar
3. Ingresar
4. Salir
========================
				""");
		temp = Integer.parseInt(input.nextLine());
		switch (temp)
		{
			case 1:
				System.out.printf("%.2f%n", saldo);
				break;
			case 2:
				temp = Integer.parseInt(input.nextLine());
				if (temp > saldo || temp < 1)
				{
					System.out.println("Error");
					break ;
				}
				saldo = saldo - temp;
				break;
			case 3:
				temp = Integer.parseInt(input.nextLine());
				if (temp < 1)
				{
					System.out.println("Error");
					break ;
				}
				saldo = saldo + temp;
				break;
			case 4:
				System.out.println("Operacion finalizada");
				break;
			default:
				break;
		}
		input.close();
		return ;
	}
	
}
