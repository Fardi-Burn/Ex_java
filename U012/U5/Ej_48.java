import java.util.Scanner;

public class Ej_48
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		
		double	total = Double.parseDouble(input.nextLine());
		double	mayor_v = total;
		double	menor_v = total;
		int		dia_mayor_v = 1;
		int		dia_menor_v = 1;

		for (int i = 0; i < 6; i++)
		{
			double num = Double.parseDouble(input.nextLine());
			total += num;
			if (num > mayor_v)
			{
				mayor_v = num;
				dia_mayor_v = i + 1;
			}
			if (num < menor_v)
			{
				menor_v = num;
				dia_menor_v = i + 1;
			}
		}

		System.out.println("Total " + total);
		System.out.println("Media " + (total / 7));
		System.out.println("Mayor venta " + mayor_v);
		System.out.println("Menor venta " + menor_v);
		System.out.println("Dia con mayor venta " + (dia_mayor_v + 1));
		System.out.println("Dia con menor venta " + (dia_menor_v + 1));
		input.close();
		return ;
	}	
}
