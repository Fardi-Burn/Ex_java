import java.util.Scanner;

public class Ej_28 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int	num;
		int div = 0;
		
		num = Integer.parseInt(input.nextLine());
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
				div++;
		}
		System.out.println(div);
		input.close();
		return ;
	}	
}
