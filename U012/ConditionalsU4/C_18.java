import java.util.Scanner;

public class C_18
{
	// Al quitar los breaks podemos ver que se ejecuta en cascado desde la opcion seleccionada.
	static public void main(String args[])
	{
		int		n_l;
		Scanner	input = new Scanner(System.in);

		System.out.printf("Pon un numero del 1 al 4 para elegir el idioma%n 1 = Espanol%n 2 = Ingles%n 3 = Frances%n 4 = Italiano%n");
		n_l = Integer.parseInt(input.nextLine());
		switch (n_l)
		{
			case 1:
				System.out.println("Espanol elegido");
			case 2:
				System.out.println("English selected");
			case 3:
				System.out.println("Français sélectionné");
			case 4:
				System.out.println("Italiano selezionato");
			default:
				System.out.println("No lenguague seleccionado");
		}
		input.close();
		return ;
	}	
}