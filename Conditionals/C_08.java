import java.util.Scanner;

public class C_08
{
	static public void main(String argv[])
	{
		int temp;
		Scanner input = new Scanner(System.in);
		temp = Integer.parseInt(input.nextLine());

		if (temp < -40 || temp > 85)
			System.out.println("Out of service");
		return ;
	}	
}
