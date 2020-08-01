import java.util.*; 
class Main{

	public static int concat_nos(int a, int b)
	{
		if(b < 10)
		{
			return (a * 10) + b;
		}
	
		return (a * 100) + b;
	}

	public static int is_prime(int n)
	{
		if(n <= 3)
		{
			return 1;
		}
	
		int i;
		for(i = 2; i <= (n/2); i++)
		{
			if(n % i == 0)
			{
				return 0;
			}
		}
	
		return 1;
	}

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);	
		int N, prime_count = 0, concated_cnt = 0, i, j;
		Set<Integer> s = new HashSet<Integer>();
		N = in.nextInt();
		int primes[] = new int[70];
		for(i = 2; i <= N; i++)
		{
			if(is_prime(i) == 1)
			{
				primes[prime_count++] = i;
			}
		}
	
		for(i = 0; i < prime_count; i++)
		{
			for(j = i + 1; j < prime_count; j++)
			{
				if(i == j)
				{
					continue;
				}
			
				int concated_no1 = concat_nos(primes[i], primes[j]);
				int concated_no2 = concat_nos(primes[j], primes[i]);
				if(is_prime(concated_no1) == 1)
				    s.add(concated_no1);
				if(is_prime(concated_no2) == 1)
				    s.add(concated_no2);
			}
		}
	    concated_cnt = s.size();
		System.out.print(concated_cnt);

	}
}