public class Retroceso 
{
	public static void main(String[] args) 
	{
		int arr[] = {5, 2, 1, 4, 7};
		int	loop = 1;

		for (int i = 0; i < arr.length - 1; i++)
		{
			System.out.printf("Pasada %d: [", loop);
			for (int j = 0; j < arr.length; j++)
			{
				System.out.printf("%d", arr[j]);
				if (j == arr.length - loop - 1)
					System.out.printf("|");
				else if (j != arr.length - 1)
					System.out.printf(",");
			}
			System.out.printf("]%n");
			loop++;
		}
	}	
}
