import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.next());
    while(t-- != 0)
    {
      int check = 0;
      int N = Integer.parseInt(sc.next());
      int T = Integer.parseInt(sc.next());
      int Z[] = new int[N];
      for(int i =0;i<N;i++){
      	Z[i] = Integer.parseInt(sc.next());
      }
      int P = Integer.parseInt(sc.next());
      int D = Integer.parseInt(sc.next());
      if(T<N)
        check++;
      else{
      	Arrays.sort(Z);
        for(int i=0;i<N;i++){
        	if(P>Z[i])
              P = P + (P - Z[i]);
          else{
          	check++;
            break;
          }
        }
      }
      if(P>=D && check==0){
      	System.out.print("YES");
      }
      else{
      	System.out.print("NO");
      }
      check =0;
    }
  }
}