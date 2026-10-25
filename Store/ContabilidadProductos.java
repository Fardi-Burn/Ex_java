
import java.util.Scanner;

public class ContabilidadProductos
{
    static public void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int arr_l;
        int i = 0;

        System.out.printf("Insert number of items: ");
        arr_l = Integer.parseInt(input.nextLine());

        if (arr_l < 1)
        {
            System.out.println("Error: input incorrecta");
            input.close();
            return;
        }

        Item arr[] = new Item[arr_l];

        while (i < arr_l)
        {
            arr[i] = new Item();

            System.out.printf("Nombre(String) producto: ");
            arr[i].producto = input.nextLine();

            System.out.printf("Cantidad(int) producto: ");
            arr[i].cantidad = Integer.parseInt(input.nextLine());

            System.out.printf("Precio(double) producto: ");
            arr[i].precio = Double.parseDouble(input.nextLine());

            System.out.printf("Descuento(%%) producto: ");
            arr[i].descuentoPorcentaje =
                Double.parseDouble(input.nextLine());

            arr[i].importe = arr[i].cantidad * arr[i].precio;

            arr[i].descuento =
                arr[i].importe * arr[i].descuentoPorcentaje / 100;

            arr[i].neto = arr[i].importe - arr[i].descuento;

            i++;
        }

        tickets_table(arr_l, arr);

        input.close();
    }

    static public void tickets_table(int arr_l, Item arr[])
    {
        int i = 0;
        int length = 100;
        int totalUnidades = 0;
        double totalBruto = 0;
        double totalDescuentos = 0;
        double totalNeto = 0;

        System.out.println("-".repeat(length));

        System.out.printf(
            "%-25s %6s %10s %8s %12s %12s %12s%n",
            "Producto", "Cant.", "Precio/u", "Desc.%",
            "Bruto", "Descuento", "Neto"
        );

        System.out.println("-".repeat(length));

        while (i < arr_l)
        {
            System.out.printf(
                "%-25s %6d %10.2f %8.2f %12.2f %12.2f %12.2f%n",
                arr[i].producto,
                arr[i].cantidad,
                arr[i].precio,
                arr[i].descuentoPorcentaje,
                arr[i].importe,
                arr[i].descuento,
                arr[i].neto
            );

            totalUnidades += arr[i].cantidad;
            totalBruto += arr[i].importe;
            totalDescuentos += arr[i].descuento;
            totalNeto += arr[i].neto;

            i++;
        }

        System.out.println("-".repeat(length));

        System.out.println("================ RESUMEN DE VENTA ================");
        System.out.printf("Total de unidades:    %d%n", totalUnidades);
        System.out.printf("Importe bruto total:   %.2f%n", totalBruto);
        System.out.printf("Descuentos aplicados:  %.2f%n", totalDescuentos);
        System.out.printf("IMPORTE FINAL:         %.2f%n", totalNeto);
    }
}

class Item
{
    public String producto;
    public int cantidad;
    public double precio;
    public double descuentoPorcentaje;
    public double importe;
    public double descuento;
    public double neto;
}
