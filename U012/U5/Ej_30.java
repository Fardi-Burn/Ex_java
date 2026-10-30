public class Ej_30
{
	public static void main(String[] args) 
	{
		for (int i = 2; i <= 80; i++)
		{
			int num = i;
			int div = 0;
			boolean	out = false;
			for (int j = 2; j <= num && out == false; j++)
			{
				if (num % j == 0)
					div++;
				if (div > 1)
					out = true ;	
				else if (j == num)
					System.out.println(num);
			}
		}
		return ;
	}	
}
