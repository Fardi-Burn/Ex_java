import java.util.NoSuchElementException;
import java.util.Scanner;

	/*
		final String HORIZONTAL = "\u2500";  // ─
		final String VERTICAL = "\u2502";    // │

		final String SUP_IZQ = "\u250C";     // ┌
		final String SUP_DER = "\u2510";     // ┐

		final String INF_IZQ = "\u2514";     // └
		final String INF_DER = "\u2518";     // ┘

		final String UNION_IZQ = "\u251C";   // ├
		final String UNION_DER = "\u2524";   // ┤

		final String UNION_SUP = "\u252C";   // ┬
		final String UNION_INF = "\u2534";   // ┴

		final String CRUCE = "\u253C";       // ┼


			/// Colors
		final String RESET = "\u001B[0m";

		final String ROJO = "\u001B[31m";
		final String VERDE = "\u001B[32m";
		final String AMARILLO = "\u001B[33m";
		final String AZUL = "\u001B[34m";
		final String MAGENTA = "\u001B[35m";
		final String CIAN = "\u001B[36m";

		final String CABECERA = "\u001B[1;37;44m";
		*/

public class StrAnalizer
{

	
// MAIN
	static public void main(String argv[])
	{
		// Start of main
		header();
		upper_table();
		
		Scanner scan = new Scanner(System.in);
		String	str = scan.nextLine();
		while (true)
		{
			print_info_table(str);
			System.out.println();
			try
			{
				str = scan.nextLine();
			}
			catch (NoSuchElementException e)
			{
				break ;
			}
		}

		scan.close();
		return ;
	}

	static private void print_info_table(String str)
	{
				/// Colors
		final String RESET = "\u001B[0m";

		final String ROJO = "\u001B[31m";
		final String VERDE = "\u001B[32m";
		final String AMARILLO = "\u001B[33m";
		final String AZUL = "\u001B[34m";
		final String MAGENTA = "\u001B[35m";
		final String CIAN = "\u001B[36m";

		final String CABECERA = "\u001B[1;37;44m";
		

		String temp = str.replace(" ", "");
		System.out.printf(" %-19s", str);
		System.out.printf("%s%-19s%s", VERDE, str.toLowerCase(), RESET);
		System.out.printf("%s%-19s%s", AMARILLO, str.toUpperCase(), RESET);
		System.out.printf("%-19s" ,str.strip());
		System.out.printf("%-7d" ,str.length());
		System.out.printf("%-8d" , temp.length());
		temp = str.strip();
		System.out.printf("%-5d" , temp.length());
		System.out.printf("%-8c" , str.charAt(0));
		System.out.printf("%-5c" , str.charAt(str.length() - 1));

		return ;
	}

	
	// HEADER AND UPPER TABLE
	static private void header()
	{
		final String RESET = "\u001B[0m";
		final String VERDE = "\u001B[32m";

		System.out.printf("""
%s
****  ***** ****
*       *   *   *
***     *   ****
   *    *   * *
****    *   *  **
%s
				""", VERDE, RESET);
				return ;
	}

	static private void upper_table()
	{
		// Shapes for table
		final String HORIZONTAL = "\u2500";  // ─
		final String VERTICAL = "\u2502";    // │

		final String SUP_IZQ = "\u250C";     // ┌
		final String SUP_DER = "\u2510";     // ┐

		final String INF_IZQ = "\u2514";     // └
		final String INF_DER = "\u2518";     // ┘

		final String UNION_IZQ = "\u251C";   // ├
		final String UNION_DER = "\u2524";   // ┤

		final String UNION_SUP = "\u252C";   // ┬
		final String UNION_INF = "\u2534";   // ┴

		final String CRUCE = "\u253C";       // ┼
		
		/// Colors
		final String RESET = "\u001B[0m";

		final String ROJO = "\u001B[31m";
		final String VERDE = "\u001B[32m";
		final String AMARILLO = "\u001B[33m";
		final String AZUL = "\u001B[34m";
		final String MAGENTA = "\u001B[35m";
		final String CIAN = "\u001B[36m";

		final String CABECERA = "\u001B[1;37;44m";

		// Start of function
		String	str =
		SUP_IZQ + HORIZONTAL.repeat(18) +
		UNION_SUP + HORIZONTAL.repeat(18) +
		UNION_SUP + HORIZONTAL.repeat(18) +
		UNION_SUP + HORIZONTAL.repeat(18) +
		UNION_SUP + HORIZONTAL.repeat(5) +
		UNION_SUP + HORIZONTAL.repeat(7) +
		UNION_SUP + HORIZONTAL.repeat(5) +
		UNION_SUP + HORIZONTAL.repeat(7) +
		UNION_SUP + HORIZONTAL.repeat(5) + SUP_DER + RESET + "\n"
		;

		System.out.printf("%s%s%s%s%s", CABECERA, AZUL ,str, AZUL, CABECERA);

		System.out.printf(
		VERTICAL + "%-18s" +
		VERTICAL + "%-18s" +
		VERTICAL + "%-18s" +
		VERTICAL + "%-18s" +
		VERTICAL + "%-5s" +
		VERTICAL + "%-7s" +
		VERTICAL + "%-5s" +
		VERTICAL + "%-7s" +
		VERTICAL + "%-5s" + VERTICAL + RESET + "\n", "ORIGINAL", "LOWERCASE", "UPPERCASE", "NO EXTREMES", "LENGT", "N SPACE", "STRIP", "START", "END");
		
		str = AZUL + CABECERA +
		INF_IZQ + HORIZONTAL.repeat(18) +
		UNION_INF + HORIZONTAL.repeat(18) +
		UNION_INF + HORIZONTAL.repeat(18) +
		UNION_INF + HORIZONTAL.repeat(18) +
		UNION_INF + HORIZONTAL.repeat(5) +
		UNION_INF + HORIZONTAL.repeat(7) +
		UNION_INF + HORIZONTAL.repeat(5) +
		UNION_INF + HORIZONTAL.repeat(7) +
		UNION_INF + HORIZONTAL.repeat(5) + INF_DER
		;
		System.out.printf("%s%s\n", str, RESET);
	}

}