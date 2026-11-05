import java.util.Scanner;

public class C_24
{
	public static void main(String[] args) 
	{
		System.out.println("introduce 1 o 2");
		
		Scanner input = new Scanner(System.in);
		int	num = Integer.parseInt(input.nextLine());
		String text = switch(num)
		{
			case 1 ->
			{
				System.out.println("elegido 1");
				yield "Texto 1";
			}
			case 2 ->
			{
				System.out.println("elegido 2");
				yield "texto 2";
			}
			default -> "texto default";
		};
		System.out.printf("%s%n", text);
		input.close();
		return ;
	}
	
}
