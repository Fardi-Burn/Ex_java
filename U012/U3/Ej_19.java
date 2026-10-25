import java.util.Scanner;

public class Ej_19
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer entero: ");
        int numero1 = input.nextInt();

        System.out.print("Introduce el segundo entero: ");
        int numero2 = input.nextInt();

        System.out.println("Valores originales:");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);

        int auxiliar = numero1;
        numero1 = numero2;
        numero2 = auxiliar;

        System.out.println("Valores intercambiados:");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);

        input.close();
    }
}
