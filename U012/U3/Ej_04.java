import java.util.Scanner;

public class Ej_04
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la primera distancia: ");
        double distancia_1 = input.nextDouble();

        System.out.print("Introduce la segunda distancia: ");
        double distancia_2 = input.nextDouble();

        double media = (distancia_1 + distancia_2) / 2;

        System.out.printf("Distancia media: %.2f%n", media);

        input.close();
    }
}
