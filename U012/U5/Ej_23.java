import java.util.Scanner;

public class Ej_23
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int	num[] = new int[6];
		int smaller;
		
		for (int i = 0; i < 6; i++)
		{
			num[i] = Integer.parseInt(input.nextLine());	
		}
		smaller = num[0];
		for (int i = 1; i < 6; i++)
		{
			if (smaller > num[i])
				smaller = num[i];
		}
		System.out.println("Smallest " + smaller);
	
		return ;	
	}	
}
