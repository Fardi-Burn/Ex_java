import java.util.Scanner;

public class Store
{
	static class product
	{
		String	Name;
		double	Price;
		int		Num;
	}
	static class client
	{
		int		c_type;
		char	p_type;
		
	}

	public static void main(String args[])
	{
		banner();
		product	p = new product();
		Scanner input = new Scanner(System.in);

		// Parseo nombre producto
		System.out.printf("Inserte nombre producto: ");
		p.Name = input.nextLine();
		while (p.Name.isEmpty() || p.Name.strip().length() <= 0)
		{
			System.out.printf("Error: Stringa vacia:%n");
			p.Name = input.nextLine();
		}
		p.Name = p.Name.strip();

		// Parseo entrada double precio
		boolean	correct = false;
		System.out.printf("Inserte precio unitario (€): ");
		while (!correct)
		{
			try
			{
				p.Price = Double.parseDouble(input.nextLine());
				while (p.Price <= 0)
				{
					System.out.printf("Error: Num negativo o cero:%n");
					p.Price = Double.parseDouble(input.nextLine());
				}
				correct = true;
			}
			catch (NumberFormatException e)
			{
				System.out.printf("Error: numero no valido%n");
			}
		}
		correct = false;

		// Parseo int cantidad
		System.out.printf("Inserte cantidad del producto: ");
		while (!correct)
		{
			try
			{
				p.Num = Integer.parseInt(input.nextLine());
				while (p.Num <= 0 || p.Num > 10)
				{
					System.out.printf("Error: Num negativo o cero o mayor de diez%n");
					p.Num = Integer.parseInt(input.nextLine());
				}
				correct = true;
			}
			catch (NumberFormatException e)
			{
				System.out.printf("Error: numero no valido%n");
			}
		}

		//  cliente
		client	cli;

		
		return ;
	}





	static public void client_type(client cli, Scanner input)
	{
		System.out.println("""
Tipo de cliente
----------------
1. Particular
2. Estudiante
3. Empresa

				""");
		System.out.printf("Seleccione: ");
		boolean	correct = false;
		while (!correct)
		{
			try
			{
				cli.c_type = Integer.parseInt(input.nextLine());
				while (cli.c_type < 1 || cli.c_type > 3)
				{
					System.out.printf("Error: Num negativo o cero: ");
					cli.c_type =Integer.parseInt(input.nextLine());
				}
				correct = true;
			}
			catch (NumberFormatException e)
			{
				System.out.printf("Error: numero no valido: ");
			}
		}
		correct = false;
		System.out.println("""
Forma de pago
-------------
T. Tarjeta
E. Efectivo
B. Bizum
				""");
				// Arreglar poner letras
		while (!correct)
		{
				cli.p_type = input.nextLine().charAt(0);
				while (cli.c_type != 'T' && cli.c_type != 'E' && cli.c_type != 'B')
				{
					System.out.printf("Error: Letra incorrecta: ");
					cli.p_type = input.nextLine().charAt(0);
				}
				correct = true;
		}
		return ;
	}



	
	static public void banner()
	{
		char esqSupIzq = '\u2554'; // ╔
		char esqSupDer = '\u2557'; // ╗
		char esqInfIzq = '\u255A'; // ╚
		char esqInfDer = '\u255D'; // ╝
		char horiz      = '\u2550'; // ═
		char vert       = '\u2551'; // ║

		String	temp = esqSupIzq + Character.toString(horiz).repeat(40) + esqSupDer;
		System.out.printf("%s%n", temp);
		System.out.printf("%s %s %s%n", Character.toString(vert), "         TECHSTORE - NUEVA VENTA      ", Character.toString(vert));
		temp = esqInfIzq + Character.toString(horiz).repeat(40) + esqInfDer;
		System.out.printf("%s%n", temp);
	}
}

