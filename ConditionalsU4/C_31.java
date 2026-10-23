import java.util.Scanner;

public class C_31
{
	public static void main(String[] args)
	{
		int x;
		int y;
		
		Scanner input = new Scanner(System.in);
		x = Integer.parseInt(input.nextLine());
		y = Integer.parseInt(input.nextLine());
		if (x > 0 && y > 0)
			System.out.println("Cuadrante I");
		else if (x < 0 && y > 0)
			System.out.println("Cuadrante II");
		else if (x > 0 && y < 0)
			System.out.println("Cuadrante III");
		else if (x < 0 && y < 0)
			System.out.println("Cuadrante VI");
		else
			System.out.println("Origen");

		input.close();
		return ;
	}	
}
