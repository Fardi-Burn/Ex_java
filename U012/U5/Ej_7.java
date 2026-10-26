import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class Ej_7
{
	public static void main(String[] args) 
	{
		int p;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.println("inserte porcentaje");
			p = Integer.parseInt(input.nextLine());

		} while (p < 0 || p > 100);
		input.close();
		return ;
	}	
}
