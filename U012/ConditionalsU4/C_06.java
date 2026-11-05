import java.util.Scanner;

public class C_06
{
	static public void main(String argv[])
	{
		int	battery = 36;
		Scanner input = new Scanner(System.in);
		battery = Integer.parseInt(input.nextLine());

		if (battery > 100)
			System.out.println("Battery levels unachiavable");
		else if (battery > 81)
			System.out.println("Battery levels high");
		else if (battery > 40)
			System.out.println("Battery levels low");
		else if (battery > 15)
			System.out.println("Battery levels critic");
		else if (battery < 0)
			System.out.println("Battery levels negative");
		input.close();
		return ;
	}	
}