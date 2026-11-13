import java.util.Arrays;
import java.util.Scanner;

public class Ej_04 
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		int num[] = new int[5];
		
		for (int i = 0; i < num.length; i++)
		{
			num[i] = Integer.parseInt(input.nextLine());
		}

		for (int i = num.length - 1; i >= 0; i--)
		{
			System.out.printf("%d ", num[i]);
		}
		System.out.println();

		input.close();
		return ;
	}	
}
