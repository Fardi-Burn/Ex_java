import java.util.Scanner;

public class Ej_9 
{
  public static void main(String[] args) 
  {
    int i;
    Scanner input = new Scanner(System.in);

    do {
      System.out.println("inserte numero 1, 2 o 3");
      i = Integer.parseInt(input.nextLine());
    } while (i != 1 && i != 2 && i != 3);

    input.close();
    return;
  }
}
