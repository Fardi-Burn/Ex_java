import java.util.Scanner;

public class Ej_29
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura en Fahrenheit: ");
        double fahrenheit = Double.parseDouble(input.nextLine());

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperatura en Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Temperatura en Celsius: %.2f%n", celsius);

        input.close();
    }
}
