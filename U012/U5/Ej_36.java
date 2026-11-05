import java.util.Scanner;

public class Ej_36
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int		temp;	
		for (int i = 0; i < 10; i++)
		{
			temp = Integer.parseInt(input.nextLine());
			if (temp == 99)
				break ;
		}
		input.close();
		return ;
	}	
}
