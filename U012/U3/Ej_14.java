import java.util.Scanner;

public class Ej_14
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Precio por participante: ");
        double precio = input.nextDouble();

        System.out.print("Numero de participantes: ");
        int participantes = input.nextInt();

        double total = precio * participantes;

        System.out.printf("Importe total: %.2f%n", total);

        input.close();
    }
}
