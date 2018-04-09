import java.util.*;
import java.io.File;

public class AC_2_a
{
	public static void main(String[] args) {
		int max, min;
		Scanner sc;
		try 
		{
			sc = new Scanner(new File("Data.txt") );
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
		String s;
		int sum=0;
		while( sc.hasNextLine()  )
		{
			max = -1;
			min = Integer.MAX_VALUE;
			s = sc.nextLine();
			Scanner line = new Scanner(s);
			while(line.hasNext() )
			{
				Integer next = line.nextInt();
				if(next > max)
					max = next;
				if(next < min)
					min = next;
			}
			sum += max - min;
		}
		System.out.println(sum);
	}
}