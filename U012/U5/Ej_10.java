import java.util.Scanner;

public class Ej_10
{
	public static void main(String[] args)
	{
		int	i;
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("""
1. Revisar
2. Reiniciar
3. Diagnóstico
4. Salir
					""");
			i = Integer.parseInt(input.nextLine());
		} while (i != 4);
		
	}
}
