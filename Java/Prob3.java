public class Prob3
{
	public static void main(String[] args)
	{
		float num = 600851475143f;
		float prime = 0f;
		int count = 2;
		while(count*count <= num)
		{
			if(num % count == 0)
				num /= count;
			else
				count += 1;
		}
		if(num <= count)
			prime = num;
		System.out.println("Largest prime factor: " + prime);
	}
}