public class Ex2214
{
	static public void main(String argv[])
	{
		double	length = 152.40;
		int		stages = 5;
		long	bytes = 345000000;

		double	stage_length = length / stages;
		long	stage_bytes = bytes / stages;

		System.out.println("Each stage lenght is");
		System.out.println(stage_length);
		System.out.println("Each stage byte amount is");
		System.out.println(stage_bytes);
		return ;
	}
}
