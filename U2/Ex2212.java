public class Ex2212
{
	static public void main(String argv[])
	{
		int	int_th = 13;
		int	int_fi = 5;

		double	double_th = 13;
		double	double_fi = 5;

		System.out.println(int_th / int_fi);
		System.out.println(double_th / double_fi);
		return ;
		// Las output son diferentes porque los ints no tienen decimales y los double si asi que pueden dar una division mas precisa
	}
}
