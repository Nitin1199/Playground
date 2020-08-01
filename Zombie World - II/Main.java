import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int B = Integer.parseInt(sc.next());
    int N =  Integer.parseInt(sc.next());
    int Z[] = new int[N];
    for(int i =0;i<N; i++)
    {
      Z[i] =  Integer.parseInt(sc.next());
    }
    Arrays.sort(Z);
    for(int i =0;i<N; i++)
    {
      B = B - (Z[i]%2 + Z[i]/2);
    }
    if(B>0)
    {
      System.out.print("YES");
    }
    else{
    	System.out.print("NO");
    }
  }
}