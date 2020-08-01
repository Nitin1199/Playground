import java.util.*;


class Main{

public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    int k,n,t;
    k=sc.nextInt();
    n=sc.nextInt();
    t=sc.nextInt();
    int flats[][]=new int[n][n];
    for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		    flats[i][j]=sc.nextInt();
		}
	}
	int pj[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    pj[i]=sc.nextInt();
	}
	int rj[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    rj[i]=sc.nextInt();
	}
	int z=0;
		
	for(int i=0;i<n;i++)
	{
		z=0;
		for(int j=0;j<n;j++)
		{
			flats[i][j]=flats[i][j]*pj[z];
			z++;
		}
	}
	int count=0,value=0,wtp=0;
	for(int i=0;i<n;i++)
	{
		value=pj[i];
		wtp=value*rj[i];
		for(int j=0;j<n;j++)
		{
			if(value>=k && wtp<=t)
			{
				count++;break;
			}
			wtp+=flats[i][j]*rj[j];
			value+=flats[i][j];
		}
		wtp=0;
		value=0;
	}
	System.out.println(count);
}
}