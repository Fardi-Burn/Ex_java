import java.util.Scanner;

public class C_32
{
	public static void main(String[] args)
	{	
		int		a;
		int		b;
		char	symbol;
		
		Scanner input = new Scanner(System.in);
		a = Integer.parseInt(input.nextLine());
		symbol = input.nextLine().charAt(0);
		b = Integer.parseInt(input.nextLine());
		int	result;
		switch (symbol)
			{
					case '+': result = a + b; break;
					case '-': result = a - b; break;
					case '*': result = a * b; break;
					case '/':
			if (b == 0)
			{
				input.close();
				return ;
			}
			result = a / b;
			break;
			case '%':
				if (b == 0)
				{
					input.close();
					return ;
				}
				result = a % b;
				break ;
			default:
				input.close();
				return ;
			}
		System.out.printf("%d%n", result);
	
		input.close();
		return ;
	}
}
