import java.util.Scanner;
import java.util.Locale.Category;

public class BlackPearl
{
	static public void main(String argv[])
	{
		System.out.println(header());
	
	
		System.out.printf("%s\n%50s\n%s\n", "=".repeat(80), "Black Pearls's Accounting Book","=".repeat(80));
		Scanner scan = new Scanner(System.in);
		////////////////////////////////// Expedition info
		// Boat name
		System.out.printf("Name of the boat: ");
		String	boat_n = scan.nextLine();
		// Boat captain
		System.out.printf("Name of the captain: ");
		String	boat_cap = scan.nextLine();
		// Loot registry
		System.out.printf("Number of loot registry: ");
		int		n_registry = Integer.parseInt(scan.nextLine());
		// Number of crew members
		System.out.printf("Number of crew members: ");
		int		n_crewMembers = Integer.parseInt(scan.nextLine());
		// Category of expedition
		System.out.printf("Expeditions's category: ");
		String temp = scan.nextLine();
		char	category = temp.charAt(0);
		// Loot safe?
		System.out.printf("Is loot safe? (true/false): ");
		boolean	loot_s = Boolean.parseBoolean(scan.nextLine());


		////////////////// Chest Info
		//	Number of chests
		System.out.printf("--- DOUBLOONS CHEST ---\n");
		System.out.printf("Number of chest: ");
		int		chest_n = Integer.parseInt(scan.nextLine());
		// Doubloons per chest
		System.out.printf("Number of doubloons per chest: ");
		int		doubloons_chest = Integer.parseInt(scan.nextLine());
		// Value of each doubloon
		System.out.printf("Value of individual doubloon: ");
		double	doubloon_value = Double.parseDouble(scan.nextLine());


		///////////// Rum barrels
		// Number of barrels
		System.out.printf("--- RUM BARRELS ---\n");
		System.out.printf("Number of barrels: ");
		int			barrel_c = Integer.parseInt(scan.nextLine());
		// Value of barrel
		System.out.printf("Value of barrels: ");
		double		barrel_v = Double.parseDouble(scan.nextLine());


		///////////// Nautic maps
		// Number of maps
		System.out.printf("--- NAUTIC MAPS ---\n");
		System.out.printf("Number of maps: ");
		int		map_c = Integer.parseInt(scan.nextLine());
		// Value map
		System.out.printf("Value map: ");
		double		map_v = Double.parseDouble(scan.nextLine());


		////////////////////////////////
		// Calcs
		////////////////////////////////
		int		totalDobloons		= chest_n * doubloons_chest;
		double	totalDobloons_value	= totalDobloons * doubloon_value;
		double	totalRum_value		= barrel_v * barrel_c;
		double	totalMap_value		= map_v * map_c;
		double	totalShipment_value = totalDobloons_value + totalMap_value + totalRum_value;
		int		doubloon_pirate		= totalDobloons / n_crewMembers;
		int		doubloon_spare		= totalDobloons % n_crewMembers;
		
		System.out.println("=".repeat(60));
		System.out.printf("%s Invetory\n", " ".repeat(30));
		System.out.println("=".repeat(60));

		// Table
		System.out.println("-".repeat(80));
		System.out.printf("%-15s %8s %10s %10s %10s %10s\n",
		 "Shipment", "Amount", "Unit price", "Total", "Type", "Safe");
		System.out.println("-".repeat(80));
		// Print info table
		System.out.printf("%-15s %8d %10.2f %10.2f %10c %10s\n",
		 "Doubloons chest", chest_n, doubloons_chest * doubloon_value, totalDobloons_value, category, loot_s);
		System.out.printf("%-15s %8d %10.2f %10.2f %10c %10s\n",
		 "Rum barrels", barrel_c, barrel_v, totalRum_value, category, loot_s);
		System.out.printf("%-15s %8d %10.2f %10.2f %10c %10s\n",
		 "Nautic maps", map_c, map_v, totalMap_value, category, loot_s);
		System.out.println("-".repeat(80));

		//////////////////////////// Account summary
		System.err.printf("%-24s Accounting Summary %s\n\n", "=".repeat(40), "=".repeat(40));
		System.out.printf("%-24s %10d%n", "Total of doubloons", totalDobloons);
		System.out.printf("%-24s %10.2f%n", "Total Value of doubloons", totalDobloons_value);
		System.out.printf("%-24s %10.2f%n", "Value of rum", totalRum_value);
		System.out.printf("%-24s %10.2f%n", "Value of maps", totalMap_value);
		System.out.printf("%s%n", "-".repeat(80));
		System.out.printf("%-24s %10.2f%n%n", "TOTAL VALUE", totalDobloons_value + totalMap_value + totalRum_value);
		System.out.printf("%-24s %10d%n", "Crew members" ,n_crewMembers);
		System.out.printf("%-24s %10d%n", "Doubloons per pirate" ,doubloon_pirate);
		System.out.printf("%-24s %10d%n", "Spare doubloons", doubloon_spare);
		
		/////////////////////////// More prints
		System.out.printf("\"C:\\Users\\rardmun2709\\Downloads>\"");
		System.out.printf("⚓%n");
		return ;
	}
	
	
	
	
	
	static private String header()
	{
		return (" ".repeat(5) + "*".repeat(10) + 
		" ".repeat(10) + "/".repeat(19) 
		+ "\n" +
		" ".repeat(3) + "*".repeat(13) +
		" ".repeat(8) + "/".repeat(2) + " ".repeat(15) + "/".repeat(2)
		+ "\n" +
		" ".repeat(2) +  "*".repeat(3) + " ".repeat(3) + "*".repeat(3) + " ".repeat(3) + "*".repeat(3) +
		" ".repeat(6) + "/".repeat(2) + " ".repeat(15) + "/".repeat(2)
		+ "\n" + 
		" ".repeat(1) +  "*".repeat(4) + " ".repeat(2) + "*".repeat(3) + " ".repeat(3) + "*".repeat(4) +
		" ".repeat(5) + "/".repeat(2) + " ".repeat(15) + "/".repeat(2)
		+ "\n" +
		" ".repeat(2) + "*".repeat(15) +
		" ".repeat(4) + "/".repeat(2) + " ".repeat(15) + "/".repeat(2)
		+ "\n" +
		" ".repeat(3) + "*".repeat(6) + " " + "*".repeat(6) +
		" ".repeat(4)
		+ "/".repeat(19) 
		+ "\n" +
		" ".repeat(5) + "*".repeat(3) + " " + "*" + " " + "*".repeat(3) 
		+ "\n" +
		" ".repeat(5) + "*".repeat(8) 
		+ "\n"


		);
	}
}