public class AC_1_b
{
	public static void main(String[] args) {
		int sum=0;
		for (int i = 0 ; i< args[0].length(); i++ ) {
			if(args[0].charAt(i) == args[0].charAt( (i+ args[0].length()/2 ) % args[0].length() ) )
			{
				sum +=	Character.getNumericValue(args[0].charAt(i));
			} 
		}
		System.out.println(sum);
	}
}