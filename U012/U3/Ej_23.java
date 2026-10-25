import java.util.Scanner;

public class Ej_23
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println(a / b);
        System.out.println(a % b);

        input.close();
    }
}
