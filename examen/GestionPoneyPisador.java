import java.util.Scanner;

public class GestionPoneyPisador
{
	static public void main(String args[])
	{	
		header();

		Scanner	input = new Scanner(System.in);
		String	nombrePosadero;
		long	numLicencia;
		int		numMesas;
		char	catTaberna = 0;
		boolean	habitacionesDisponibles;

		// Datos generales taberna
		System.out.printf("%s", "Nombre del posadero: ");
		nombrePosadero = input.nextLine();
		System.out.println();

		System.out.printf("%s", "Numero de licencia del establecimiento: ");
		numLicencia = Long.parseLong(input.nextLine());
		System.out.println();

		System.out.printf("%s", "Numero de mesas disponibles: ");
		numMesas = Integer.parseInt(input.nextLine());
		System.out.println();

		System.out.printf("%s", "Categoria de taberna (A, B o C): ");
		
		catTaberna = input.nextLine().charAt(0);
		while (catTaberna != 'A' && catTaberna != 'B' && catTaberna != 'C')
		{
			System.out.printf("Error input try again: %n");
			catTaberna = input.nextLine().charAt(0);
		}
		System.out.println();

		System.out.printf("%s", "Habitaciones disponibles?: ");
		habitacionesDisponibles = Boolean.parseBoolean(input.nextLine());
		System.out.println();

		// Productos
		String	cervezaBree = "Cerveza de Bree";
		String	estofadoCasa = "Estofado de la Casa";
		String	pastelManzana = "Pastel de Manzana";

		int		cantidadCerveza;
		int		cantidadEstofado;
		int		cantidadPastel;
		double	precioCerveza;
		double	precioEstofado;
		double	precioPastel;

		// Cerveza datos
		System.out.printf("%s cantidad: ", cervezaBree);
		cantidadCerveza = Integer.parseInt(input.nextLine());
		System.out.printf("%s precio: ", cervezaBree);
		precioCerveza = Double.parseDouble(input.nextLine());
		// Estofado datos
		System.out.printf("%s cantidad: ", estofadoCasa);
		cantidadEstofado = Integer.parseInt(input.nextLine());
		System.out.printf("%s precio: ", estofadoCasa);
		precioEstofado = Double.parseDouble(input.nextLine());
		// Pastel datos
		System.out.printf("%s cantidad: ", pastelManzana);
		cantidadPastel = Integer.parseInt(input.nextLine());
		System.out.printf("%s precio: ", pastelManzana);
		precioPastel = Double.parseDouble(input.nextLine());
		
		// Inventario
		int long_table = 85;
		// 1 linea
		System.out.printf("-".repeat(long_table));
		System.out.println();
		// 2 linea
		System.out.printf("%-1s %30s %20s %20s %n", "Producto", "Stock", "Precio/u", "Valor Stock");
		// 3 linea
		System.out.printf("-".repeat(long_table));
		System.out.println();
		// Prouctos imprimidos con datos
		System.out.printf("%1s %23d %20.2f %20.2f %n", cervezaBree, cantidadCerveza, precioCerveza, cantidadCerveza * precioCerveza);
		System.out.printf("%1s %19d %20.2f %20.2f %n", estofadoCasa, cantidadEstofado, precioEstofado, cantidadEstofado * precioEstofado);
		System.out.printf("%1s %21d %20.2f %20.2f %n", pastelManzana, cantidadPastel, precioPastel, cantidadPastel * precioPastel);
		System.out.printf("-".repeat(long_table));
		System.out.println();
		System.out.println();

		// Resumen invetario
		double	valortotalStock = (cantidadCerveza * precioCerveza) + (cantidadEstofado * precioEstofado) + (cantidadPastel * precioPastel);
		System.out.println("-".repeat(10) + " RESUMEN DEL ALMACEN " + "-".repeat(10));
		System.out.println();
		System.out.println();
		System.out.printf("%s %20d %n", "Productos dieferentes", 3);
		System.out.printf("%s %21d %n", "Unidades disponibles", cantidadCerveza + cantidadEstofado + cantidadPastel);
		System.out.printf("%s %11.2f %n", "Valor total del inventario €", valortotalStock);
		System.out.println();
		System.out.printf("%s %17c %n", "Categoria de la taberna", catTaberna);
		System.out.printf("%s %16b %n", "Habitaciones disponibles", habitacionesDisponibles);

		// Registrar pedido
		String	nombreCliente;
		int		numMesa;
		int		numPedido;

		System.out.println();
		System.out.printf("Pedido cliente%n");
		System.out.printf("Nombre del cliente: ");
		nombreCliente = input.nextLine();
		System.out.printf("Numero de mesa: ");
		numMesa = Integer.parseInt(input.nextLine());
		System.out.printf("Numero de pedido: ");
		numPedido = Integer.parseInt(input.nextLine());

		int	numJarrasPedidas;
		int	numEstofadoPedidas;
		int	numPastelPedidas;

		System.out.printf("Numero de jarras de cerveza: ");
		numJarrasPedidas = Integer.parseInt(input.nextLine());
		System.out.printf("Numero de raciones de estofado: ");
		numEstofadoPedidas = Integer.parseInt(input.nextLine());
		System.out.printf("Numero de porciones de pastel: ");
		numPastelPedidas = Integer.parseInt(input.nextLine());

		// Precio del pedido por producto
		double precioPedidoJarra = numJarrasPedidas * precioCerveza;
		double precioPedidoEstofado = numEstofadoPedidas * precioEstofado;
		double precioPedidoPastel = numPastelPedidas * precioPastel;
		// Total del pedido
		double precioTotalPedido = precioPedidoJarra + precioPedidoEstofado + precioPedidoPastel;


		// Ticket cabezera
		System.out.printf("=".repeat(long_table));
		System.out.println();
		System.out.printf("%-40s %s %n", " ","EL PONEY PISADOR");
		System.out.printf("=".repeat(long_table));
		System.out.println();
		System.out.printf("Pedido: %d %n", numPedido);
		System.out.printf("Cliente: %s %n", nombreCliente);
		System.out.printf("Mesa: %d %n", numMesa);
		// Ticket producto
		// 1 linea
		System.out.printf("-".repeat(long_table));
		System.out.println();
		// 2 linea
		System.out.printf("%-1s %30s %20s %20s %n", "Producto", "Cantidad", "Precio/u", "Importe");
		// 3 linea
		System.out.printf("-".repeat(long_table));
		System.out.println();
		// Prouctos imprimidos con datos
		System.out.printf("%1s %23d %20.2f %20.2f %n", cervezaBree, numJarrasPedidas, precioCerveza, precioPedidoJarra);
		System.out.printf("%1s %19d %20.2f %20.2f %n", estofadoCasa, numEstofadoPedidas, precioEstofado, precioPedidoEstofado);
		System.out.printf("%1s %21d %20.2f %20.2f %n", pastelManzana, numPastelPedidas, precioPastel, precioPedidoPastel);
		System.out.printf("-".repeat(long_table));
		System.out.println();
		System.out.printf("%1s %75.2f%n", "TOTAL", precioTotalPedido);
		System.out.println("=".repeat(long_table));



		input.close();
		return ;
	}

	static void header()
	{
		// 1 line
		System.out.printf(" ".repeat(2));
		System.out.printf("*".repeat(2));
		System.out.printf(" ".repeat(3));
		System.out.printf("*".repeat(2));
		//  1 Title
		System.out.printf(" ".repeat(10));
		System.out.printf("/-------------------\\%n");
		// 2 line
		System.out.printf(" ".repeat(2));
		System.out.printf("*".repeat(4));
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(4));
		// 2 line Title
		System.out.printf(" ".repeat(7));
		System.out.printf(" | EL PONEY PISADOR  |%n");
		// 3 line
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(3));
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(3));
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(3));
		// 3 line Title
		System.out.printf(" ".repeat(7));
		System.out.printf("\\-------------------/%n");
		// 4 line
		System.out.printf("*".repeat(2));
		System.out.printf(" ".repeat(3));
		System.out.printf("*".repeat(3));
		System.out.printf(" ".repeat(3));
		System.out.printf("*".repeat(2));
		System.out.println();
		// 5 line
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(2));
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(5));
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(2));
		System.out.println();
		// 6 line
		System.out.printf(" ".repeat(3));
		System.out.printf("*".repeat(7));
		System.out.println();
		// 7 line
		System.out.printf(" ".repeat(4));
		System.out.printf("*".repeat(2));
		System.out.printf(" ".repeat(1));
		System.out.printf("*".repeat(2));
		System.out.println();
		// 8 line
		System.out.printf(" ".repeat(5));
		System.out.printf("*".repeat(3));
		// Tavern name
		System.out.println();
		System.out.println(" TABERNA DE BREE");
		System.out.println();
		// Gestion de inventario y pedidos banner
		System.out.printf("=".repeat(55));
		System.out.println();
		System.out.printf("%-10s %s %n", " ","GESTION DE INVENTARIO Y PEDIDOS");
		System.out.printf("=".repeat(55));
		System.out.println();
		return ;
	}
}