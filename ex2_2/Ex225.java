package exercises.ex2_2;

public class Ex225
{
    static public void main(String argv[])
    {
        int tables = 14;
        int max_p_table = 6;

        System.out.printf("Mesas disponibles: %d\n", tables);
        System.out.printf("Personas por mesa: %d\n", max_p_table);
        System.out.printf("Aforo calculado: %d\n", tables * max_p_table);
    }
}