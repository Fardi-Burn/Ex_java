import java.util.Scanner;

public class Ej_49 
{
	final String CLAVE = "delta42";
	
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		int		tries = 0;
		boolean	accepted = false;
		
		while (!accepted && tries < 3)
		{
			System.out.println("Insert password:");
			String	pass = input.nextLine();
			if (pass.equals(CLAVE))
				accepted = true;
			else
				System.out.println("Incorrect password");
			tries++;
		}
		if (!accepted)
		{
			System.out.println("Maximun amount of tries");
			input.close();
			return ;
		}

		System.out.println("Welcome to the system");
		input.close();
		return ;
	}	
}
