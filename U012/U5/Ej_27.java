import java.util.Scanner;

public class Ej_27
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int	num;
		
		num = Integer.parseInt(input.nextLine());
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
				System.out.println(i);
		}
		input.close();
		return ;
	}	
}
