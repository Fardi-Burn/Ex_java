import java.util.Scanner;

public class C_11
{

	static public void main(String argv[])
	{
		Scanner	input = new Scanner(System.in);
		int		day;
		day = Integer.parseInt(input.nextLine());
		if (day == 6 || day == 7)
			System.out.println("Fin de semana");
		input.close();
		return ;
	}
}
