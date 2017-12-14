public class Prob2
{
	public static void main(String[] args)
	{
		int sum = 0;
		int last = 1;
		int result = 2;
		for(;result < 4000000;)
		{
			if(result%2 == 0)
				sum += result;
			int temp = result;
			result += last;
			last = temp;
		}
		System.out.println("Sum: " + sum);
	}
}