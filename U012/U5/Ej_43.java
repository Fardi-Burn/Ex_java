public class Ej_43
{
	public static void main(String[] args) 
	{
		int	f1 = 1;
		int	f2 = 1;
		int	num;
		System.out.println(f1);
		System.out.println(f2);
		int pos = 1;
		
		for (int i = 1; i < 15; i++)
		{
			num = f1 + f2;
			if (pos == 1)
			{
				pos = 2;
				f1 = num;
			}
			else
			{
				pos = 1;
				f2 = num;
			}
			System.out.println(num);
		}
	}	
}
