import java.util.Scanner;

public class Ej_27
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Capacidad del disco en GB: ");
        double capacidad = Double.parseDouble(input.nextLine());

        System.out.print("Porcentaje ocupado: ");
        double porcentaje = Double.parseDouble(input.nextLine());

        double ocupado = capacidad * porcentaje / 100;

        System.out.printf("Espacio ocupado: %.2f GB%n", ocupado);

        input.close();
    }
}
