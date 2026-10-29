import java.util.Scanner;

public class Ej_19
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int num[] = new int[10];
		System.out.println("Insert 1 temp");
		num[0] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 2 num");
		num[1] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 3 num");
		num[2] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 4 num");
		num[3] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 5 num");
		num[4] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 6 num");
		num[5] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 7 num");
		num[6] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 8 num");
		num[7] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 9 num");
		num[8] = Integer.parseInt(input.nextLine());
		System.out.println("Insert 10 num");
		num[9] = Integer.parseInt(input.nextLine());

		int	zero = 0;
		int	positive = 0;
		int negative = 0;

		for (int i = 0; i < 10; i++)
		{
			if (num[i] == 0)
				zero++;
			else if (num[i] > 0)
				positive++;
			else
				negative++;
		}
		System.out.println("Number of zero " + zero);
		System.out.println("Number of positive " + positive);
		System.out.println("Number of negative " + negative);
		input.close();
		return ;

	}	
}

