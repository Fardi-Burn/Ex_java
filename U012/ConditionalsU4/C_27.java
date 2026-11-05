import java.util.Scanner;

public class C_27
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num;

		num = Integer.parseInt(input.nextLine());
		
		if (num >= 50)
			System.out.println("Alto");
		else if (num >= 10)
			System.out.println("Medio");
		else if (num >= 0)
			System.out.println("Alto");
		else
			System.out.println("Valor no valido");
		
		input.close();
		return ;
	}	
}
