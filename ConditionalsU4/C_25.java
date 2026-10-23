import java.util.Scanner;

public class C_25
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("inserte precio");
		double precio = Double.parseDouble(input.nextLine());
		System.out.printf("%.2f%n", precio);
		double discount; 
		
		if(300 <= precio)
			discount = 0.15;
		else if(150 <= precio)
			discount = 0.1;
		else if(80 <= precio)
			discount = 0.05;
		else
			discount = 0;
		System.out.printf("descuento %.0f%%%n", discount * 100);
		System.out.printf("importe final %.2f%n", precio - (discount * precio));
		input.close();
		return ;
	}

}
