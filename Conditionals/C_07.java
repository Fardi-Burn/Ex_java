import java.util.Scanner;

public class C_07
{
	static public void main(String argv[])
	{
		int	humidity = 36;
		Scanner input = new Scanner(System.in);
		humidity = Integer.parseInt(input.nextLine());

		if (humidity >= 30 && humidity <= 70)
			System.out.println("Good humidity levels");
		return ;
	}	
}
