import java.util.Scanner;

public class Ej_42 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int 	num = Integer.parseInt(input.nextLine());
		String	str = Integer.toString(num);
		char	temp[] = str.toCharArray();

		int	j = str.length() - 1;
		for (int i = 0; i < str.length(); i++)
		{
			temp[i] = str.charAt(j);
			j--;
		}
		System.out.println(temp);
		
		int num2 = Integer.parseInt(String.valueOf(temp));
		if (num == num2)
			System.out.println("same number");
		else
			System.out.println("Diferent number");

		input.close();
		return ;
	}	
}
