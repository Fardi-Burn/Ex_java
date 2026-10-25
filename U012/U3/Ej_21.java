import java.util.Scanner;

public class Ej_21
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Titulo completo: ");
        String titulo = input.nextLine();

        System.out.print("Numero de paginas: ");
        int paginas = Integer.parseInt(input.nextLine());

        System.out.print("Precio: ");
        double precio = Double.parseDouble(input.nextLine());

        System.out.print("Codigo de edicion: ");
        char codigo = input.nextLine().charAt(0);

        System.out.print("Disponible (true/false): ");
        boolean disponible = Boolean.parseBoolean(input.nextLine());

        System.out.println("\n--- REGISTRO DE PUBLICACION ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Paginas: " + paginas);
        System.out.printf("Precio: %.2f euros%n", precio);
        System.out.println("Codigo de edicion: " + codigo);
        System.out.println("Disponible: " + disponible);

        input.close();
    }
}
