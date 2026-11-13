import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestArray
{
	public static void main(String[] args) 
	{
		
		int	nums[] = new int[10];

		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = i + 10;
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Math.random() * 100);

		
		Scanner	input = new Scanner(System.in);
		System.out.println("Name file:");
		String NameFile = input.nextLine();
		File f = new File(NameFile);
		
		try
		{
			if (f.createNewFile())
			{
				System.out.println("File created: " + f.getName());
			}
			else
			{
				System.out.println("File already exist");
			}

		}
		catch (IOException e)
		{
			System.out.println("Error");
			e.printStackTrace();
			return ;
		}
		boolean	out = false;

		try (FileWriter writer = new FileWriter(NameFile))
		{
			while (!out)
			{
				String temp = input.nextLine();
				if (temp.equals("STOP"))
					out = true;
				else
					writer.write(temp + '\n');
			}
		}
		catch (IOException e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}