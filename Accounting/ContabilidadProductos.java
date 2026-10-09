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
			System.out.printf("Nombre(String) producto: ");
			arr[i].producto = input.nextLine();
			System.out.printf("Cantidad(int) producto: ");
			arr[i].cantidad = Integer.parseInt(input.nextLine());
			System.out.printf("Precio(double) producto: ");
			arr[i].precio = Double.parseDouble(input.nextLine());
			arr[i].importe = arr[i].cantidad * arr[i].precio;
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
			System.out.printf("%-20s %-8s %-12s %-14s%n", arr[i]);
			i++;
		}
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
