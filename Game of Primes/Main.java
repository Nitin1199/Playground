import java.util.Scanner;
class Main{
    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		long lower = in.nextLong();
		long upper = in.nextLong();
		long n = in.nextLong();
        boolean is_true = true;
		if(lower>upper || lower<=0 || n<=0)
		{ 
            is_true = false;
		}      
        int count = 0;
        long i=0;
        for (i=lower; i<=upper; i++) {
            if(isPrime(i)  && (isHappy(i)==true))
            {
                count++;
                // cout << i <<  " ";
                if(count==n)
                {   
                    System.out.print(i);
                    break;
                }
            }
         }
        if(is_true == false){
                System.out.print("Invalid Input");
        }
        else if(i>upper)
        {
           System.out.print("No number is present at this index");
        }
    }   
	public static boolean isPrime(long num) {
   
        boolean flag = false;
        if (num < 2) {
            return flag;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return flag;
        }
        int i = 3;
        int rootn = (int)(Math.sqrt(num));
        for (; i <= rootn; i += 2) {
            if (num % i == 0) {
                break;
            }

        }
        if (i > rootn) {
            flag = true;
        }
        return flag;
    }

    public static long numSquareSum(long n) 
    { 
		long squareSum = 0; 
		while(n != 0) 
		{ 
			squareSum += (n % 10) * (n % 10); 
			n /= 10; 
		} 
		return squareSum; 
    }
	public static boolean isHappy(long n)
    {
        long slow, fast; 
  
		// initialize slow and fast by n 
		slow = fast = n; 
		do
		{ 
			// move slow number by one iteration 
			slow = numSquareSum(slow); 
  
			// move fast number by two iteration 
			fast = numSquareSum(numSquareSum(fast)); 
  
		} 
		while (slow != fast); 
  
		//    if both number meet at 1, then return true 
		if(slow == 1)
		    return true;
		return false;
    }
}