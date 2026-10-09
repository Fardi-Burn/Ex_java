import java.util.Scanner;

public class C_12
{
	static public void main(String argv[])
	{
		int		n1;
		int		n2;
		Scanner	input = new Scanner(System.in);

		System.out.printf("Insert first number: ");
		n1 = Integer.parseInt(input.nextLine());
		System.out.printf("Insert second number: ");
		n2 = Integer.parseInt(input.nextLine());
		if (n2 != 0)
			System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
		else
			System.out.println("Error in divisor:");
		input.close();
		return ;
	}
	
}
