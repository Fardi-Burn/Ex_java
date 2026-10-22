import java.util.Scanner;
import java.util.UnknownFormatConversionException;

public class Store
{
	static class product
	{
		String	Name;
		double	Price;
		int		Num;
		double	Total;
		double	Discount_r;
		double	Discount_c;
		double	Discount_p;
		double	Sum_Discount;
		double	SubTotal;
		double	Shipping_cost;
	}
	static class client
	{
		int		c_type;
		char	p_type;
		String	Tier_Buy;
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

		p.Total = p.Price * p.Num;
		//  cliente
		client	cli = new client();
		client_type(cli, input); // Se asgina el tipo de cliente y forma de pago
		// Descuentos
		p.Discount_r = Discount_calc(p.Total);
		p.Discount_c = Discount_typeclient(cli, p);
		p.Discount_p = Discount_payment(cli, p);
		p.Sum_Discount = p.Discount_c + p.Discount_p + p.Discount_r;
		if (p.Sum_Discount > 0.15)
			p.Sum_Discount = 0.15;
		p.SubTotal = p.Total - (p.Total * p.Sum_Discount);

		// Gastos envio
		p.Shipping_cost = ShippingCost_calc(cli, p);
		// Clasificacion compra
		cli.Tier_Buy = Tier_Buy_calc(p);
		// Ticket
		Ticket_maker(cli, p);

		input.close();
		return ;
	}









	static public void Ticket_maker(client cli, product p)
	{
		char esqSupIzq = '\u2554'; // ╔
		char esqSupDer = '\u2557'; // ╗
		char esqInfIzq = '\u255A'; // ╚
		char esqInfDer = '\u255D'; // ╝
		char horiz     = '\u2550'; // ═
		char vert      = '\u2551'; // ║
		char cruz      = '\u2560'; // ╠
		char cruzDer   = '\u2563'; // ╣

		// Cabecera
		System.out.printf("%c%s%c%n",
				esqSupIzq, String.valueOf(horiz).repeat(46), esqSupDer);

		System.out.printf("%c%46s%c%n",
				vert, "TECHSTORE - TICKET", vert);

		// Separador
		System.out.printf("%c%s%c%n",
				cruz, String.valueOf(horiz).repeat(46), cruzDer);

		// Datos del producto
		System.out.printf("%c Producto                 %-19s %c%n",
				vert, p.Name, vert);

		System.out.printf("%c Precio unitario          %17.2f € %c%n",
				vert, p.Price, vert);

		System.out.printf("%c Cantidad                 %17d   %c%n",
				vert, p.Num, vert);

		// Separador
		System.out.printf("%c%s%c%n",
				cruz, String.valueOf(horiz).repeat(46), cruzDer);

		// Descuentos y gastos
		System.out.printf("%c Importe bruto            %17.2f € %c%n",
				vert, p.Total, vert);

		System.out.printf("%c Dto. por importe         %17.2f € %c%n",
				vert, p.Discount_r * p.Price, vert);

		System.out.printf("%c Dto. cliente             %17.2f € %c%n",
				vert, p.Discount_c * p.Price, vert);

		System.out.printf("%c Dto. forma de pago       %17.2f € %c%n",
				vert, p.Discount_p * p.Price, vert);

		System.out.printf("%c Descuento calculado      %17.2f € %c%n",
				vert, p.Sum_Discount, vert);

		System.out.printf("%c Descuento aplicado       %17.2f € %c%n",
				vert, p.Sum_Discount, vert);

		System.out.printf("%c Gastos de envío          %17.2f € %c%n",
				vert, p.Shipping_cost, vert);

		// Separador
		System.out.printf("%c%s%c%n",
				cruz, String.valueOf(horiz).repeat(46), cruzDer);

		// Total y clasificación
		System.out.printf("%c TOTAL                    %17.2f € %c%n",
				vert, p.SubTotal, vert);

		System.out.printf("%c Clasificación            %-19s %c%n",
				vert, cli.Tier_Buy, vert);

		// Cierre
		System.out.printf("%c%s%c%n",
				esqInfIzq, String.valueOf(horiz).repeat(46), esqInfDer);
	}

	static public String Tier_Buy_calc(product p)
	{
		if (p.SubTotal <= 100)
			return ("BASICA");
		else if (p.SubTotal <= 300)
			return ("ESTANDAR");
		else if (p.SubTotal <= 500)
			return ("PREMIUM");
		else
			return ("VIP");
	}

	static public double ShippingCost_calc(client cli, product p)
	{
		if (cli.c_type == 2 && p.Num >= 3 && p.SubTotal >= 300)
			return (0);
		else if (p.Total >= 400)
			return (0);
		else if (cli.c_type == 3 && p.Num >= 5)
			return (0);
		else
			return (6.95);
	}

	static public double Discount_payment(client cli, product p)
	{
		if (cli.p_type == 'E')
			return (0.02);
		else if (cli.p_type == 'B' && p.Total >= 200)
			return (0.01);
		else
			return (0);
	}

	static public double Discount_typeclient(client cli, product p)
	{
		if (cli.c_type == 2 && p.Num >= 2)
			return (0.03);
		else if (cli.c_type == 3 && p.Num >= 3 && p.Total >= 250)
			return (0.04);
		else
			return (0);
	}

	static public double Discount_calc(double TotalPrice)
	{
		if (TotalPrice < 100)
			return (0);
		else if (TotalPrice < 300)
			return (0.05);
		else if (TotalPrice < 500)
			return (0.08);
		else
			return (0.1);
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
			try
			{
				String aux = "";
				cli.p_type = (aux = input.nextLine()).length() == 1 ? aux.charAt(0) : ' ';
				while (cli.p_type != 'T' && cli.p_type != 'E' && cli.p_type != 'B')
				{
					System.out.printf("Error: Letra incorrecta: ");
					cli.p_type = (aux = input.nextLine()).length() == 1 ? aux.charAt(0) : ' ';
				}
				correct = true;
			}
			catch(UnknownFormatConversionException e)
			{
				System.out.printf("Error: Letra incorrecta%n");
			}
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

