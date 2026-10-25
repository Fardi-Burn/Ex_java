import java.util.Scanner;

public class Ej_24
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero de elementos: ");
        int cantidad = input.nextInt();

        System.out.println("Cantidad: " + cantidad);

        input.close();
    }
}
