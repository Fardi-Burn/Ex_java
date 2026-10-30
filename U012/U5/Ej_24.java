import java.util.Scanner;;

public class Ej_24 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int	num[] = new int[8];
		int smaller;
		int biggest;
		
		for (int i = 0; i < 8; i++)
		{
			num[i] = Integer.parseInt(input.nextLine());	
		}
		biggest = num[0];
		for (int i = 1; i < 8; i++)
		{
			if (biggest < num[i])
				biggest = num[i];
		}
		smaller = num[0];
		for (int i = 1; i < 8; i++)
		{
			if (smaller > num[i])
				smaller = num[i];
		}
		System.out.println("Smallest " + smaller);
		System.out.println("Biggest " + biggest);
	}
}
