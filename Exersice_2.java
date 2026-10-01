package exercises;

/**
 * Write a description of class Exersice_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exersice_2
{
    static public void main(String argv[])
    {
        System.out.println("""
            /\\
           /  \\
          /    \\
         /______\\
                        """);
        print_hours();
        System.out.printf("The are of a square with l 6 and h 10 = ");
        square_area_calc(6, 10);
        System.out.println(2 + 3);
    }
    static private void print_hours()
    {
        System.out.println("Hora\tLunes\tMartes\tMiercoles");
        System.out.println("8:15\tPROG\tBBDD\tSI");
        System.out.println("9:15\tPROG\tBBDD\tSI");
        System.out.println("10:15\tLM\tSMT\tBTW");
    }
    static private void square_area_calc(int length, int height)
    {
        int area = length * height / 2;
        System.out.println(area);
    }
}