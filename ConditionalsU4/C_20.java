import java.util.Scanner;

public class C_20
{
	static public void main(String args[])
	{
		String	str;
		Boolean	k_loop = true;
		Scanner	input = new Scanner(System.in);

		while (k_loop)
		{
			System.out.println("Insert command: start, stop or status");
			str = input.nextLine();
			switch (str.toLowerCase())
			{
				case "start":
					System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In ultrices.");
					break ;
				case "stop":
					System.out.println("Closing program...");
					k_loop = false;
					break ;
				case "status":
					System.out.printf("Status operative%n");
					break ;
				default:
					break ;
			}
		}
		input.close();
		return ;
	}
}
