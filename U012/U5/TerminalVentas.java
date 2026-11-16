
import java.util.Scanner;

public class TerminalVentas 
{
    public static void main(String[] args) 
    {
            Scanner input = new Scanner(System.in);
            boolean out = false;
            int     lineas = 0;
            int     articulos = 0;
            int     unidades_total = 0;
            double  subtotal = 0;
            
            do
            {
                System.out.printf("Inserte nombre producto: ");
                input.nextLine();
                System.out.printf("Precio: ");
                double precio = Double.parseDouble(input.nextLine());
                System.out.printf("Inserte unidades: ");
                int    unidades = Integer.parseInt(input.nextLine());

                unidades_total += unidades;
                subtotal += precio;
                articulos++;
                System.out.printf("Anadir otro articulo?: (S/N)%n");
                if (!input.nextLine().equalsIgnoreCase("S"))
                    out = true;
            } while (!out);

            final double IVA = 0.21;

            System.out.printf("Resumen Ventas:%n");
            System.out.printf("Lineas: %d %n", articulos);
            System.out.printf("Unidades: %d %n", unidades_total);
            System.out.printf("Subtotal: %.2f %n", subtotal);
            System.out.printf("IVA: %.2f %n", subtotal * IVA);
            double temp = subtotal + (subtotal * IVA);
            System.out.printf("Total: %.2f %n", temp);

            input.close();
            return ;
    }    
}
