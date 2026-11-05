import java.util.Scanner;

public class C_22
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserte numero:");

		int mes = Integer.parseInt(input.nextLine());

		switch (mes)
		{
			case 1, 3 ,5, 7, 8, 10, 12 :
				System.out.println("31 dias");
				break;
			case 2:
				System.out.println("28 dias");
				break;
			case 4, 6, 9, 11:
				System.out.println("30 dias");
				break;
			default:
				System.out.println("Mes inexistente");
				break;
		}
		input.close();
		return ;
	}	
}
