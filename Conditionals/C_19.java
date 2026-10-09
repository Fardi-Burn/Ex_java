import java.util.Scanner;

public class C_19
{
	static public void main(String args[])
	{
		Scanner	input = new Scanner(System.in);
		char	letter;

		letter = input.nextLine().charAt(0);
		switch (letter)
		{
			case 'M':
				System.out.println("Mañana");
				break ;
			case 'T':
				System.out.println("Tarde");
				break ;
			case 'N':
				System.out.println("Noche");
				break ;
			default:
				System.out.printf("%c desconocido, intenta con M, T o N%n", letter);
		}
		input.close();
		return ;
	}	
}
