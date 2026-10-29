import java.util.Scanner;

public class Ej_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		int	num;
		
		for (int i = 0; i < 12; i++)
		{
			num = Integer.parseInt(input.nextLine());
			if (num % 2 == 0)
				even++;
			else
				odd++;	
		}
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + odd);
		input.close();
		return ;
	}	
}
