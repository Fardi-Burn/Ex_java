import java.util.Scanner;

public class C_39
{
	public static void main(String[] args)
	{
		int	dia;
		int	mes;
		
		Scanner input = new Scanner(System.in);
		System.out.println("DIa:");
		dia = Integer.parseInt(input.nextLine());
		System.out.println("Mes:");
		mes = Integer.parseInt(input.nextLine());
		
		if (mes < 1 || mes > 12)
		{
			System.out.println("Mes inexsistente");
			input.close();
			return ;
		}
		boolean existe = false;
		switch (mes)
		{
			case 1, 3 ,5, 7, 8, 10, 12 :
				if (dia <= 31 && dia > 0)
					existe = true;
				break;
			case 2:
				if (dia <= 28 && dia > 0)
					existe = true;
				break;
			case 4, 6, 9, 11:
				if (dia <= 30 && dia > 0)
					existe = true;
				break;
			default:
				break;
		}
		if (existe)
			System.out.println("dia valido");
		input.close();
		return ;
	}
}
