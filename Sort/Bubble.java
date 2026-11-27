import java.util.Arrays;

class Bubble
{
	static public void main(String args[])
	{
		//int arr[] = {5, 6, 7};
		int arr[] = {5, 2, 1, 4, 7};
		int	pair = 0;

		for (int i = 0; i < arr.length; i += 2)
		{
			if (i + 1 >= arr.length)
			{
				System.out.printf("Numero solitario = {%d}%n", arr[i]);
				return ;
			}
			System.out.printf("Pareja %d = {%d, %d}%n", pair++, arr[i], arr[i + 1]);
		}
	}
}