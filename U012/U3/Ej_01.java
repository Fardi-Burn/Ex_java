import java.util.Scanner;

public class Ej_01 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce tu alias: ");
        String alias = input.next();

        System.out.println("Usuario conectado: " + alias);

        input.close();
    } 
}
