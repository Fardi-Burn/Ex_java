import java.util.Arrays;
import java.util.Scanner;

public class Ej_03 
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		int num[] = new int[5];
		
		for (int i = 0; i < num.length; i++)
		{
			num[i] = Integer.parseInt(input.nextLine());
		}

		System.out.println(Arrays.toString(num));

		input.close();
		return ;
	}	
}
