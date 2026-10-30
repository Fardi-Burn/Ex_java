import java.util.Scanner;

public class Ej_25 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int	num;
		
		num = Integer.parseInt(input.nextLine());
		int temp = 1;
		if (num < 1)
		{
			System.out.println("Error:");
			return ;
		}
			for (int i = 1; i <= num; i++)
		{
			temp = temp * i;
		}
		System.out.println(temp);
	}
}
