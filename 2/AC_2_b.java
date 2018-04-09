import java.util.*;
import java.io.File;

public class AC_2_b
{
	public static void main(String[] args) {
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
		int first, second;
		int flag; 
		while( sc.hasNextLine()  )
		{
			flag =1;
			s = sc.nextLine();
			Scanner line = new Scanner(s);			
			while(line.hasNext() )
			{
				first = line.nextInt() ;
				Scanner checker = new Scanner(s);
				for(int i =0; i < flag; i++)
					if(checker.hasNext())
						checker.nextInt();
				while(checker.hasNext())
				{
					second = checker.nextInt();
					if(second > first)
					{
						if(second % first == 0)
							sum+= second/first;
					}
					else
					{
						if(first % second == 0)
							sum+= first/second;
					}
				}
				flag++;
				 
			}
		
		}
		System.out.println(sum);
	}
}