import java.util.Scanner;

public class Ej_15
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Precio inicial: ");
        double precio = input.nextDouble();

        System.out.print("Porcentaje de descuento: ");
        double porcentaje = input.nextDouble();

        double descuento = precio * porcentaje / 100;
        double precioFinal = precio - descuento;

        System.out.printf("Importe del descuento: %.2f%n", descuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);

        input.close();
    }
}
