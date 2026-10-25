import java.util.Scanner;

public class Ej_06
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce una categoria: ");
        String categoria = input.next();

        char codigo = categoria.charAt(0);

        System.out.println("Primer caracter: " + codigo);

        input.close();
    }
}
