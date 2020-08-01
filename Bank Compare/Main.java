import java.util.*;

class Main{

public static double power(double b,int a)
{
    int i;
    double pow=1;
    for(i=0;i<a;i++)
    {
        pow=pow*b;
    }
    return pow;
}
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
	double p,s,mi,sum,emi,j1,j,sq;
	double bank[]=new double[5];
	int y,n,k,i,yrs,y1,l=0;
	p=sc.nextDouble();
    y=sc.nextInt();
	for(k=0;k<2;k++)
	{
	    n=sc.nextInt();
	sum=0;
	for(i=0;i<n;i++)
	{
	    yrs=sc.nextInt();
	    s=sc.nextDouble();
	    mi=0;
	    j=s/1200;
	    j1=1+j;
	    y1=yrs*12;
	    sq=power(j1,y1);
	    emi=p*(j/(1-(1/(sq))));
	    mi=emi*y1;
	    sum=sum+mi;
	}
	bank[l++]=sum;
	}
	if(bank[0]<bank[1])
	    System.out.println("Bank A");
	else
	    System.out.println("Bank B");

 }
}