import java.util.Scanner;

public class C_21
{
	public static void main(String[] args)
	{
		int		n_l;
		Scanner	input = new Scanner(System.in);

		System.out.printf("Pon un numero del 1 al 4 para elegir el idioma%n 1 = Espanol%n 2 = Ingles%n 3 = Frances%n 4 = Italiano%n");
		n_l = Integer.parseInt(input.nextLine());
		String seleccion = switch (n_l)
		{
			case 1 -> "Espanol elegido";
			case 2 -> "English selected";
			case 3 -> "Français sélectionné";
			case 4 -> "Italiano selezionato";
			default -> "No lenguague seleccionado";
		};
		System.out.printf("%s%n", seleccion);
		input.close();
		return ;
	}
}