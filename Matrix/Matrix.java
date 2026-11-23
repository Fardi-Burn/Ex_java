import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix
{
	class Personaje
	{
		int	value;
		int amount;
	}

	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		int	size;
		Random ram = new Random();
		boolean	size_help = false;
		int		tries = 4;
		int		mode = 0;

		System.out.printf("Inserte tamano de del Array (solo valores 10, 20, 30...): ");
		size = Integer.parseInt(input.nextLine());
		if (size % 10 != 0)
		{
			System.out.println("Tamano incorrecto");
			return ;
		}
		if (size >= 30)
			size_help = true;
		if (size > 10)
			tries = tries + (size / 10);
		if (size_help)
		{
			System.out.printf("Inserta modo de ayuda (0 = no ayuda, 1 = menor o mayor, 2 = caliente o frio): ");
			mode = Integer.parseInt(input.nextLine());
		}
		
		int	amount_Smith = size / 10;
		int	amount_Brown = size / 10;
		int	matrix[] = new int[size];
		boolean	matrix_found[] = new boolean[size];

		// Asignamos todo a -10 y false
		for (int i = 0; i < size; i++)
		{
			matrix_found[i] = false;
			matrix[i] = 0;
		}

		// Trinity
		int Trinity = ram.nextInt(0, size - 1);
		matrix[Trinity] = 3;

		// Smith
		int j = 0;
		while (j < amount_Smith)
		{
			int temp = ram.nextInt(0, size - 1);
			if (matrix[temp] != -1 && matrix[temp] != -2 && matrix[temp] != 3)
			{
				matrix[temp] = -1;
				j++;
			}
		}
		// Brown
		j = 0;
		while (j < amount_Brown)
		{
			int temp = ram.nextInt(0, size - 1);
			if (matrix[temp] != -1 && matrix[temp] != -2 && matrix[temp] != 3)
			{
				matrix[temp] = -2;
				j++;
			}
		}

		// Random

		//System.out.println(Arrays.toString(matrix));
		
		// BUCLE DE ADIVINAR NUMERO
		System.out.println("MATRIX - ESCAPE");
		boolean out = false;
		while (!out && tries > 0)
		{
			try
			{
				// Imprimer seccion
				System.out.println();
				for (int i = 0; i < size; i++)
				{	
					System.out.printf(" %d -> ", i);
					if (matrix_found[i])
						System.out.printf("\u001B[31m [%s]\u001B[0m", matrix[i]);
					else
						System.out.printf("[?]");
				}
				System.out.println();
				
				// Meter posicion y parseo
				int intento = Integer.parseInt(input.nextLine());
				System.out.println();
				if (matrix_found[intento] == true)
					System.out.println("Valor ya intentado");
				else if (matrix[intento] != 3 && matrix[intento] != -1 && matrix[intento] != -2)
				{
					System.out.printf("Valor: %d. No encontraste a Trinity (3)%n", matrix[intento]);
					matrix_found[intento] = true;
					tries--;
					System.out.printf("Intentos: %d	Seleccion posicion: %d%n", tries, intento);
				}
				else if (matrix[intento] == 3)
				{
					System.out.printf("Valor: %d. Encontraste a Trinity (3)%n", matrix[intento]);
					matrix_found[intento] = true;
					out = true;
					System.out.printf("Intentos: %d	Seleccion posicion: %d%n", tries, intento);
				}
				else if (matrix[intento] == -1)
				{
					System.out.printf("Valor %d. Encontraste al agente Smith (-1)%n", matrix[intento]);
					matrix_found[intento] = true;
					tries = tries - 2;
					System.out.printf("Intentos: %d	Seleccion posicion: %d%n", tries, intento);	
				}
				else if (matrix[intento] == -2)
				{
					System.out.printf("Valor %d. Encontraste al agente Brown (-2)%n", matrix[intento]);
					matrix_found[intento] = true;
					tries = tries - 3;
					System.out.printf("Intentos: %d	Seleccion posicion: %d%n", tries, intento);
				}
				if (!out && size_help)
				{
					if (mode == 1)
					{
						if (intento > Trinity)
							System.out.println("Menor que el intento.");
						if (intento < Trinity)
							System.out.println("Mayor que el intento");
					}
					if (mode == 2)
					{
						if (intento > Trinity - (size * 0.2) && intento < Trinity + (size * 0.2))
							System.out.println("\u001B[31mCaliente...\u001B[0m");
						else
							System.out.println("\033[34mFrio...\u001B[0m");
					}
				}
				
			}
			catch (Exception e)
			{
				System.out.println(e.getLocalizedMessage());
			}
		}
		input.close();

		if (tries < 1)
		{
			System.out.println("\u001B[31m GAME OVER \u001B[0m ;( ");
			System.out.println("Sin intentos restantes.");
			System.out.printf("Trinity se encontraba en la posicion %d %n", Trinity);
		}
		return ;
	}

}