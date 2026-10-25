import java.util.Scanner;

public class Ej_18
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce los segundos: ");
        int segundos = input.nextInt();

        int minutos = segundos / 60;
        int restantes = segundos % 60;

        System.out.println("Minutos completos: " + minutos);
        System.out.println("Segundos restantes: " + restantes);

        input.close();
    }
}
