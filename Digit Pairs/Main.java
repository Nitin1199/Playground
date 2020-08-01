import java.util.Scanner;
class Main{

	public static int bit(int n)
	{
		int min=999, max=0;
		while(n!=0)
		{
			int rem = n%10;
			if(min>rem)
				min =rem ;
			if(max<rem)
				max=rem;
			n/=10;
		}
		int ans = (max*11 + min*7)%100;
		return ans;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i,j,size;
		size = in.nextInt();
		boolean is_true = true;
		if(size>0 && size<=500)
		{
			int arr[] = new int[size];
			for(i=0;i<size;i++)
			{
				arr[i] = in.nextInt();
				int count=0;
				int temp=arr[i];
				while(temp != 0)
				{
					count++;
					temp/=10;
				}
				if(count!=3)
				{
					System.out.println("Invalid Input");
					is_true = false;
                   	break;
				}
				arr[i] = bit(arr[i]);
			}
			int msb_count=0,pairs=0;
			for(i=0;i<size;i++)
			{
				msb_count=0;
				for(j=i+2;j<size;j=j+2)
				{
					if(arr[i] ==0)
						break;
					else if(arr[i] /10 == arr[j]/10)
					{
						msb_count++;
						arr[j]=0;
						if(msb_count<=2)
						pairs++;
					}
				}
			}
			if(is_true == true)
			    System.out.println(pairs);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}