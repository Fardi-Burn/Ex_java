import java.util.Locale;
import java.util.Scanner;

public class Ej_05
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Introduce el primer numero decimal: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Introduce el segundo numero decimal: ");
        double numero2 = entrada.nextDouble();

        double producto = numero1 * numero2;

        System.out.println("Producto: " + producto);

        entrada.close();
    }
}
