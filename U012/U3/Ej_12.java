import java.util.Scanner;

public class Ej_12
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la revision de hardware: ");
        char revision = input.nextLine().charAt(0);

        System.out.println("Revision seleccionada: " + revision);

        input.close();
    }
}
