import java.util.Scanner;

public class C_04
{
	static public void main(String argv[])
	{
		int	persons = 0;

		Scanner input = new Scanner(System.in);
		persons = Integer.parseInt(input.nextLine());
		if (persons <= 60)
			System.out.println("Aforo correcto");
		else
			System.out.println("Aforo excedido");
		input.close();
		return ;
	}	
}