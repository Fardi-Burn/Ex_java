import java.util.Scanner;

public class Ej_40 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int		i_tmp;
		String	temp;
		
		i_tmp = Integer.parseInt(input.nextLine());
		temp = Integer.toString(i_tmp);
		
		if (i_tmp < 0)
			System.out.println("Numero negativo");
		else
		{
			int	num = 0;
			for (int i = 0; i < temp.length(); i++)
			{
					num += temp.charAt(i) - '0';
			}
			System.out.println(num);
		}
		input.close();
		return ;
	}	
}
