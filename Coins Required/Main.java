import java.util.*;
class Main
{
	public static void main(String args[])
    {
      int num_5,num_2,num_1,total;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      num_5 = (n-4)/5;
      if((n-5*num_5)%2 == 0)
        num_1=2;
      else
        num_1 = 1;
      
      num_2 = (n-5*num_5-num_1)/2;
      total = num_5+num_2+num_1;
      System.out.print(total+" "+num_5+" "+num_2+" "+num_1);
    }
}