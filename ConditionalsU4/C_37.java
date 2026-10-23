import java.util.Scanner;

public class C_37
{
	String ususario;
	String clave;

	public static void main(String[] args)
	{
		String ususario;
		String clave;

		Scanner input = new Scanner(System.in);

		System.out.println("Usuario:");
		ususario = input.nextLine();
		System.out.println("Clave:");
		clave = input.nextLine();
		if ( ususario.equals("operador") && clave.equals("delta42"))
			System.out.println("Acceso concedido");
		else
			System.out.println("Acceso denegado");
		input.close();
		return ;
	}
}