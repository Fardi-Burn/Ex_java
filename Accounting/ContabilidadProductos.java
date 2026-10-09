import java.util.Scanner;

public class ContabilidadProductos
{
	static public void main(String args[])
	{
		Scanner	input = new Scanner(System.in);
		int		arr_l;
		int		i = 0;
		
		
		System.out.printf("Insert number of items%n");
		arr_l = Integer.parseInt(input.nextLine());
		if (arr_l < 1)
		{
			System.out.println("Error: input incorrecta");
			return ;
		}

		Item	arr[] =  new Item[arr_l];
		while (i < arr_l)
		{
			arr[i] = new Item();
			System.out.printf("Nombre(String) producto: ");
			arr[i].producto = input.nextLine();
			System.out.printf("Cantidad(int) producto: ");
			arr[i].cantidad = Integer.parseInt(input.nextLine());
			System.out.printf("Precio(double) producto: ");
			arr[i].precio = Double.parseDouble(input.nextLine());
			arr[i].importe = arr[i].cantidad * arr[i].precio;
			System.out.println();
			i++;
		}
		
		tickets_table(arr_l, arr);
		return ;
	}

	static public void tickets_table(int arr_l, Item arr[])
	{
		int	i = 0;
		int	length = 50;

		System.out.println("-".repeat(length));
		System.out.printf("%-20s %-8s %-12s %-14s%n", "Producto", "Cant.", "Precio/u", "Importe");
		System.out.println("-".repeat(length));
		while (i < arr_l)
		{
			System.out.printf("%-20s %-8d %-12.2f %-14.2f%n", arr[i].producto, arr[i].cantidad, arr[i].precio, arr[i].importe);
			i++;
		}
		double	total_sum = 0;
		i = 0;
		while (i < arr_l)
		{
			total_sum += arr[i].importe;
			i++;
		}
		System.out.println("-".repeat(length));
		System.out.printf("%-42s %-1.2f%n", "TOTAL", total_sum);
		System.out.println("-".repeat(length));

		return ;
	}
}

class Item
{
	public String	producto;
	public int		cantidad;
	public double	precio;
	public double	importe;
}
