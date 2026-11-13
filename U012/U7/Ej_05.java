import java.util.Arrays;
import java.util.Scanner;

public class Ej_05 
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		int num[] = new int[10];
		int total = 0;

		for (int i = 0; i < num.length; i++)
		{
			num[i] = Integer.parseInt(input.nextLine());
			total += num[i]; 
		}

		System.out.println(total);
		System.out.println(total / num.length);

		input.close();
		return ;	
	}	
}
