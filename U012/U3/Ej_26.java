import java.util.Scanner;

public class Ej_26
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un valor: ");

        if (input.hasNextInt()) // Si lo que entra no es un int el if es false
        {
            int numero = input.nextInt();
            System.out.println("Entero recibido: " + numero);
        }

        input.close();
    }
}
