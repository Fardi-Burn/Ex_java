import java.util.Scanner;

public class Ej_13
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la distancia en metros: ");
        double metros = input.nextDouble();

        double kilometros = metros / 1000;
        double centimetros = metros * 100;

        System.out.println("Kilometros: " + kilometros);
        System.out.println("Centimetros: " + centimetros);

        input.close();
    }
}
