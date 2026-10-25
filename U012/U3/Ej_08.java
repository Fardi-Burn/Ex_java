import java.util.Scanner;

public class Ej_08
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el nombre del centro: ");
        String centro = input.next();

        System.out.println("Centro: " + centro);

        input.close();
    }
}
