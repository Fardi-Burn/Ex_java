import java.util.Scanner;

public class C_29
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int ano = Integer.parseInt(input.nextLine());

		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
			System.out.println("bisiesto");
		else
			System.out.println("no bisiesto");
		input.close();
		return ;
	}	
}
