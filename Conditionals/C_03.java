import java.util.Scanner;

public class C_03
{
	static public void main(String argv[])
	{
		int	temp = 0;

		Scanner input = new Scanner(System.in);
		temp = Integer.parseInt(input.nextLine());
		if (temp > 0)
			System.out.println("Temperatura positiva");
		else if (temp < 0)
			System.out.println("Temperatura negativa");
		else
			System.out.println("Temperatura cero");
		return ;
	}	
}