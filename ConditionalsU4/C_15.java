import java.util.Scanner;

public class C_15
{
		static public void main(String argv[])
		{
			String	letter;
			Scanner	input = new Scanner(System.in);

			letter = input.nextLine();
			if (letter.equals("N"))
				System.out.println("The letter is N");
			else if (letter.equals("S"))
				System.out.println("THE LETTTER IS SSSS");
			else if (letter.equals("E"))
				System.out.println("THE LETTER IS E FOR EAST");
			else if (letter.equals("O"))
				System.out.println("THE LETTER IS O FOR OWE");
			else
				System.out.println("I ONLY ACCEPT THE LETTER N, S, E OR O");
			input.close();
			return ;
		}
}
