import java.util.Scanner;

public class Ej_6
{
	public static void main(String[] args)
	{
		int i = 0;
		int temp = 0;
		Scanner input = new Scanner(System.in);

		while ((i = Integer.parseInt(input.nextLine())) != -1)
		{
			temp += i;
		}
		System.out.printf("%d%n", temp);
		return ;
	
	}
}
