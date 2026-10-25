import java.util.Scanner;

public class Ej_30
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre completo del servicio: ");
        String nombre = input.nextLine();

        System.out.print("Identificador numerico: ");
        int identificador = Integer.parseInt(input.nextLine());

        System.out.print("Horas de funcionamiento: ");
        double horas = Double.parseDouble(input.nextLine());

        System.out.print("Consumo medio por hora (kWh): ");
        double consumoHora = Double.parseDouble(input.nextLine());

        System.out.print("Revision (un caracter): ");
        char revision = input.nextLine().charAt(0);

        System.out.print("Estado operativo (true/false): ");
        boolean operativo = Boolean.parseBoolean(input.nextLine());

        double consumoTotal = horas * consumoHora;
        double consumoMinuto = consumoHora / 60;

        System.out.println("\n================================");
        System.out.println("       INFORME DE SERVICIO");
        System.out.println("================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificador: " + identificador);
        System.out.printf("Horas de funcionamiento: %.2f%n", horas);
        System.out.printf("Consumo medio por hora: %.2f kWh%n", consumoHora);
        System.out.println("Revision: " + revision);
        System.out.println("Estado operativo: " + operativo);
        System.out.println("--------------------------------");
        System.out.printf("Consumo total: %.2f kWh%n", consumoTotal);
        System.out.printf("Consumo medio por minuto: %.4f kWh%n", consumoMinuto);
        System.out.println("================================");

        input.close();
    }
}
