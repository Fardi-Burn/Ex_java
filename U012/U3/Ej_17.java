import java.util.Scanner;

public class Ej_17
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el total de minutos: ");
        int minutos = input.nextInt();

        int horas = minutos / 60;
        int restantes = minutos % 60;

        System.out.println("Horas completas: " + horas);
        System.out.println("Minutos restantes: " + restantes);

        input.close();
    }
}
