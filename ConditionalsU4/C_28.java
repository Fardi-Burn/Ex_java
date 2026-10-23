import java.util.Scanner;

public class C_28
{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		int	mayor = 0;
		int	menor = 0;
		Scanner input = new Scanner(System.in);
		a = Integer.parseInt(input.nextLine());
		b = Integer.parseInt(input.nextLine());
		c = Integer.parseInt(input.nextLine());
		if (a > b && a > c)
			mayor = a;
		else if (b > a && b > c)
			mayor = b;
		else if (c > a && c > b)
			mayor = c;
		
		if (a < b && a < c)
			menor = a;
		else if (b < a && b < c)
			menor = b;
		else if (c < a && c < b)
			menor = c;
		System.out.printf("mayor %d %n menor %d %n", mayor, menor);
		input.close();
		return ;
	}
}
