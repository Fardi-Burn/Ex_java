import java.util.Scanner;

public class Ej_10
{
     public static void main(String args[])
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre completo: ");
        String nombre = input.nextLine();

        System.out.print("Numero de dispositivos: ");
        int dispositivos = Integer.parseInt(input.nextLine());

        System.out.print("Coste por dispositivo: ");
        double coste = Double.parseDouble(input.nextLine());

        System.out.print("Ciudad: ");
        String ciudad = input.nextLine();

        double costeTotal = dispositivos * coste;

        System.out.println("\n--- FICHA FINAL ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de dispositivos: " + dispositivos);
        System.out.printf("Coste por dispositivo: %.2f%n", coste);
        System.out.printf("Coste total: %.2f%n", costeTotal);
        System.out.println("Ciudad: " + ciudad);

        input.close();
    }
}
