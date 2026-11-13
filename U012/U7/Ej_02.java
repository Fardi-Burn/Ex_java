import java.util.Arrays;

public class Ej_02 
{
	public static void main(String[] args) 
	{
		int num[] = new int[10];
		
		for (int i = 0; i < num.length; i++)
		{
			num[i] = i * 10;
		}

		System.out.println(Arrays.toString(num));
		return ;
	}	
}
