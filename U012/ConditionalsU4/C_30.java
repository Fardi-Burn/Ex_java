import java.util.Scanner;

public class C_30
{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		Scanner input = new Scanner(System.in);
		a = Integer.parseInt(input.nextLine());
		b = Integer.parseInt(input.nextLine());
		c = Integer.parseInt(input.nextLine());

		if (a + b > c)
		{
			System.out.println("Triangulo valido");
			if (a == b && b == c)
				System.out.println("equilatero");
			else if (a == b || a == c || c == b)
				System.out.println("isosceles");
			if (a != b && b != c && c != a)
				System.out.println("escaleno");
			input.close();
			return ;
		}
		if (a + c > b)
		{
			System.out.println("Triangulo valido");
			if (a == b && b == c)
				System.out.println("equilatero");
			else if (a == b || a == c || c == b)
				System.out.println("isosceles");
			if (a != b && b != c && c != a)
				System.out.println("escaleno");
			input.close();
			return ;
		}
		if (b + c > a)
		{
			System.out.println("Triangulo valido");
			if (a == b && b == c)
				System.out.println("equilatero");
			else if (a == b || a == c || c == b)
				System.out.println("isosceles");
			if (a != b && b != c && c != a)
				System.out.println("escaleno");
			input.close();
			return ;
		}
		System.out.println("No valido");
		input.close();
		return ;
	}	
}
