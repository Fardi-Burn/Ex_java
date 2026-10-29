import java.util.Scanner;

public class Ej_21
{
		public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int more = 0;
		int less = 0;
		int	num;
		int total = 0;
		
		for (int i = 0; i < 8; i++)
		{
			num = Integer.parseInt(input.nextLine());
			total += num;
			if (num >= 50)
				more++;
			else
				less++;	
		}

		System.out.println("Mid " + total / 8);
		System.out.println("More numbers: " + more);
		System.out.println("Less numbers: " + less);
		input.close();
		return ;
	}		
}
