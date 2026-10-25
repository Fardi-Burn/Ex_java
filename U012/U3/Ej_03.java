import java.util.Scanner;

public class Ej_03
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero de estanterias: ");
        int estanterias = input.nextInt();

        System.out.print("Cajas por estanteria: ");
        int cajas = input.nextInt();

        System.out.print("Unidades por caja: ");
        int unidades = input.nextInt();

        int total = estanterias * cajas * unidades;

        System.out.println("Capacidad total: " + total + " unidades");

        input.close();
    }
}
