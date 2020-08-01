import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
	    Scanner in = new Scanner(System.in);
		int n,m;
		n = in.nextInt();
		long h[] = new long[n];
		long cap[] = new long[n];  
			for(int i=0;i<n;i++)
			{
				h[i] = in.nextLong();
				cap[i]=i+1; 
			}
		m = in.nextInt();
		long b[] = new long[m];
		int res=0;
		int ctr=0;  
		for(int i=0;i<m;i++)
		{
			ctr=0;  
			b[i] = in.nextLong();
			for(int j=n-1;j>=0;j--)
			{
				if(b[i]<=h[j] && cap[j]!=0)
				{
					System.out.print(j+1 + " "); 
					cap[j]--;
					ctr=1;
					break;  
				}
			}
			if(ctr == 0)
				System.out.print("0 ");
		}
	}
}