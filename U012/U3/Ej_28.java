import java.util.Scanner;

public class Ej_28
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre del evento: ");
        String nombre = input.nextLine();

        System.out.print("Numero de asistentes: ");
        int asistentes = Integer.parseInt(input.nextLine());

        System.out.print("Coste de alquiler: ");
        double alquiler = Double.parseDouble(input.nextLine());

        System.out.print("Coste por asistente: ");
        double costeAsistente = Double.parseDouble(input.nextLine());

        double costeVariable = asistentes * costeAsistente;
        double costeTotal = alquiler + costeVariable;
        double costeMedio = costeTotal / asistentes;

        System.out.println("\n--- PRESUPUESTO DEL EVENTO ---");
        System.out.println("Evento: " + nombre);
        System.out.println("Asistentes: " + asistentes);
        System.out.printf("Coste variable: %.2f euros%n", costeVariable);
        System.out.printf("Coste total: %.2f euros%n", costeTotal);
        System.out.printf("Coste medio por persona: %.2f euros%n", costeMedio);

        input.close();
    }
}
