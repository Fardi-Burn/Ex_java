import java.util.Scanner;

public class Ej_16
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Potencia del aparato en vatios: ");
        double potencia = input.nextDouble();

        System.out.print("Horas de funcionamiento: ");
        double horas = input.nextDouble();

        double consumo = potencia * horas / 1000;

        System.out.printf("Consumo energetico: %.2f kWh%n", consumo);

        input.close();
    }
}
