import java.util.Arrays;
import  java.util.Scanner;

public class Ej_06
{
		public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		int num[] = new int[10];
		int total = 0;

		for (int i = 0; i < num.length; i++)
		{
			num[i] = Integer.parseInt(input.nextLine());
		}

		Arrays.sort(num);
		System.out.println("MIN: " + num[0]);
		System.out.println("MAX: " + num[num.length - 1]);


		input.close();
		return ;	
	}		
}
