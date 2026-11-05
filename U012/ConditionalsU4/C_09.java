import java.util.Scanner;

public class C_09
{	
	static public void main(String argv[])
	{
		int		age;
		boolean	authorize;
		Scanner	input = new Scanner(System.in);
		
		System.out.printf("Age: ");
		age = Integer.parseInt(input.nextLine());
		System.out.printf("Authorized: ");
		authorize = Boolean.parseBoolean(input.nextLine());

		if (age >= 18 && authorize)
			System.out.println("You can go");
		else
			System.out.println("You cant go in");
		input.close();
		return ;
	}		
}
