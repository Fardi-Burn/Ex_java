import java.util.Scanner;

public class Ej_20
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer entero: ");
        int numero1 = Integer.parseInt(input.nextLine());

        System.out.print("Introduce el segundo entero: ");
        int numero2 = Integer.parseInt(input.nextLine());

        int producto = numero1 * numero2;

        System.out.println("Producto: " + producto);

        input.close();
    }
}
