import java.util.Scanner;

public class Ej_09
{
        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Introduce un numero entero: ");
            int numero = input.nextInt();

            input.nextLine(); // Para pasar a la siguiente linea

            System.out.print("Introduce una descripcion: ");
            String descripcion = input.nextLine();

            System.out.println("Numero: " + numero);
            System.out.println("Descripcion: " + descripcion);

            input.close();
        }
}
