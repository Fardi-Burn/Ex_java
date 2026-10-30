import java.util.Scanner;

public class Ej_22
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int	num[] = new int[6];
		int bigger;
		
		for (int i = 0; i < 6; i++)
		{
			num[i] = Integer.parseInt(input.nextLine());	
		}
		bigger = num[0];
		for (int i = 1; i < 6; i++)
		{
			if (bigger < num[i])
				bigger = num[i];
		}
		System.out.println("Biggest " + bigger);
	
		return ;	
	}	
}
