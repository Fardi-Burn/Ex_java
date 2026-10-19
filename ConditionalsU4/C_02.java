import java.util.Scanner;

public class C_02
{
	static public void main(String argv[])
	{
		int	n = 0;

		Scanner input = new Scanner(System.in);
		n = Integer.parseInt(input.nextLine());

		if (n % 4 == 0)
			System.out.println("Es divisible");
		input.close();
		return ;
	}	
}