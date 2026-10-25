import java.util.Scanner;

public class Ej_07
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Sistema habilitado? true/false: ");
        boolean habilitado = input.nextBoolean();

        System.out.println("Estado del sistema: " + habilitado);

        input.close();
    }
}
