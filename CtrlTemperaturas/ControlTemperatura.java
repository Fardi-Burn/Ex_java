import java.util.Scanner;
import java.util.Vector;
import java.util.Stack;

public class ControlTemperatura
{

	static  class temps_info
	{
		Vector<Double>	temps;
		Double			highest_val;
		Double			lowest_val;
		Double			mid_val;


	}

	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		boolean	out = false;
		temps_info	t_class = new temps_info();
		t_class.temps = new Stack<>();

		do
		{
			try
			{
				print_menu();
				int	option = Integer.parseInt(input.nextLine());
				switch (option)
				{
					case 1:
						register_temps(input ,t_class);
						break;
					case 2:
						show_info(t_class);
						break;
					case 3:
						filter(input, t_class);
						break;
					case 4:
						out = true;
						break;
					default:
						System.out.println("Non existant option");
						break;
				}
			}
			catch (Exception e)
			{
				System.out.println(e.getLocalizedMessage());
			}
			
		} while (!out);


		System.out.println(t_class.temps);
		System.out.println("Salida de programa:");
		input.close();
		return ;
	}

	static void 	filter(Scanner input, temps_info t_class)
	{
		if (t_class.temps.isEmpty())
		{
			System.out.println("No hay valores para comprobar");
			return ;
		}
		try
		{
			System.out.println("Umbral de valor: ");
			int		amount = 0;
			double	total = 0;
			double	umbral = Double.parseDouble(input.nextLine());
			for (int i = 0; i < t_class.temps.size(); i++)
			{
				if (t_class.temps.get(i) > umbral)
				{
					total += t_class.temps.get(i);
					amount++;
				}
			}
			System.out.println("Cantidad de temperaturas superiores: " + amount);
			System.out.println("Media de temperaturas: " + (total / amount));
		}
		catch (Exception e)
		{
			System.out.println(e.getLocalizedMessage());
			return ;
		}
		return ;
	}
	
	static double	max_temp(Vector<Double> temps)
	{
		if (temps.isEmpty())
			return 0;
		double	max = temps.get(0);
		if (temps.size() > 1)
		{
			for (int i = 1; i < temps.size(); i++)
			{
				if (temps.get(i) > max)
					max = temps.get(i);
			}
		}

		return (max);
	}

	static double min_temp(Vector<Double> temps)
	{
		if (temps.isEmpty())
			return 0;
		double	min = temps.get(0);
		if (temps.size() > 1)
		{
			for (int i = 1; i < temps.size(); i++)
			{
				if (temps.get(i) < min)
					min = temps.get(i);
			}
		}

		return (min);
	}

	static void show_info(temps_info t_class)
	{
		if (t_class.temps.isEmpty())
		{
			System.out.println("No hay mediciones");
			return ;
		}
		System.out.println("Estadisticas generales");
		System.out.println("Mediciones: " + t_class.temps.size());
		System.out.println("Maxima " + max_temp(t_class.temps) + " C");
		System.out.println("Minima " + min_temp(t_class.temps) + " C");
		if (t_class.temps.size() >= 3)
			System.out.println("Media (tres ultimas temperaturas): " + mid_last_three(t_class) + " C");
		else
			System.out.println("No informacion para media");
		System.out.println();
	}

	static double mid_last_three(temps_info t_class)
	{
		double	total = 0;

		for (int i = 0; i < 3; i++)
		{
			total += t_class.temps.get(t_class.temps.size() - i - 1);
		}
		return (total / 3);
	}

	static void register_temps(Scanner input, temps_info t_class)
	{
		boolean out = false;
		String	tmp = "stop";
		String	value;
		System.out.println("Inserte temperaturas: escriba \"stop\" para parar de anadir temperaturas");

		do
		{
			try
			{
				double before = 0;
				if (t_class.temps.size() >= 3)
					before =	mid_last_three(t_class);
				value = input.nextLine();
		
				if (value.equals(tmp))
				{
					out = true;
				}
				else 
				{
					double	num = Double.parseDouble(value);
					t_class.temps.add(num);
					if (t_class.temps.size() >= 3)
						System.out.println("Media al registrar " + mid_last_three(t_class) + " : " + before);
				}
			}
			catch (Exception e)
			{
				System.out.println(e.getLocalizedMessage());
			}
		} while (!out);

		return ;
	}

	static void print_menu()
	{
		System.out.println("""
====================================
 CONTROL DE TEMPERATURAS
====================================
1. Registrar mediciones
2. Mostrar estadísticas
3. Consultar filtrado por umbral
4. Salir

Seleccione una opción:				
				""");
	}
}