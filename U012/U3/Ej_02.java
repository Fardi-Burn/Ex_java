import java.util.Scanner;

public class Ej_02
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el nombre del proyecto: ");
        String proyecto = input.nextLine();

        System.out.println("Nombre del proyecto: " + proyecto);

        input.close();
    }
}
