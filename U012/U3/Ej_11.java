import java.util.Scanner;

public class Ej_11
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero de operaciones realizadas: ");
        long operaciones = Long.parseLong(input.nextLine());

        long doble = operaciones * 2;

        System.out.println("El doble de las operaciones es: " + doble);

        input.close();
    }
}
