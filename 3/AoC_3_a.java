public class AoC_3_a
{
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(sum < Integer.parseInt(args[0]))
		{
			sum+= i*i++;
		}
		System.out.println(sum);
	}
}