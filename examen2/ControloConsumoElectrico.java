import java.util.Scanner;

public class ControloConsumoElectrico 
{
	public static void main(String[] args) 
	{
		Scanner	input = new Scanner(System.in);
		
		boolean out = false;
		System.out.printf("INSERTE UMBRAL DE CONSUMO POR PERIODO (kwh): ");
		float	umbral_consumo = Float.parseFloat(input.nextLine());
		float	contador_v_ini = 0;
		float	contador_v = 0;
		float	maximo = 0;
		float	minimo = 0;

		int		umbral_superado = 0;
		int		mediciones = 0;
		int		lecturas_aceptadas = 0;
		boolean	firs_read = true;
		boolean	second_read = true;


		do
		{
			try
			{
				System.out.printf("""
========== CONTROL ELÉCTRICO ==========
1. Registrar lecturas del contador
2. Consultar balance de consumo
3. Consultar alertas y tendencia
4. Salir
Seleccione una opción:	 """);

				int	option = Integer.parseInt(input.nextLine());
				switch (option) {
					case 1:
						boolean outcase1 = false;
						do
						{
							System.out.printf("Inserte cantidad (-1) para salir: ");
							
							float	temp = Float.parseFloat(input.nextLine());
							
							if (temp == -1)
								outcase1 = true;
							else if (firs_read)
							{
								contador_v = temp;
								contador_v_ini = temp;
								firs_read = false;
								lecturas_aceptadas++;
							}
							else if (firs_read == false && temp > contador_v)
							{
								if (second_read)
								{
									minimo = temp - contador_v;
									maximo = temp - contador_v;
									second_read = false;
								}
								if ((temp - contador_v) > umbral_consumo)
									umbral_superado++;
								if ((temp - contador_v) > maximo)
									maximo = temp - contador_v;
								if ((temp - contador_v) < minimo)
									minimo = temp - contador_v;

								contador_v = temp; 
								lecturas_aceptadas++;
								mediciones++;
							}
							else if (temp <= contador_v)
							{
								System.out.println("Valor invalido");
							}
						} while (!outcase1);
						System.out.println();
						break;

					case 2:
						System.out.println();
						System.out.printf("Balance%n");
						System.out.printf("Lecturas aceptadas: %d   Periodos calculados: %d %n", lecturas_aceptadas, mediciones);
						System.out.printf("Consumo total: %.2f kwh   Consumo medio: %.2f kwh %n", contador_v - contador_v_ini, (contador_v - contador_v_ini) / mediciones);
						System.out.printf("Mayor consumo: %.2f kwh   Menor consumo: %.2f kwh %n", maximo, minimo);
						System.out.println();
						break;


					case 3:
						System.out.println();
						System.out.printf("ALERTAS Y TENDENCIAS%n");
						System.out.printf("Periodos por encima de %.2f kwh: %d %n", umbral_consumo, umbral_superado);
						System.out.println();
						break;
					case 4:
						out = true;
						break;
					default:
						break;
				}
			}
			
			catch (Exception e)
			{
				System.out.println();
				System.out.println(e.getLocalizedMessage());
			}
		} while (!out);	
	}	
}
