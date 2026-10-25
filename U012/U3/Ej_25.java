import java.util.Scanner;

public class Ej_25
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce una opcion: ");
        char opcion = input.nextLine().charAt(0); // Da error porque no existe caracter y te tira excepcion

        System.out.println("Opcion seleccionada: " + opcion);

        input.close();
    }
}
