import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int totalrange = sc.nextInt();
    int cnt=0;
    int S[] = new int[size];
    for(int i=0;i<size; i++){
    	S[i] = sc.nextInt();
    }
    for(int i=0;i<totalrange; i++){
      int R1 = sc.nextInt();
      int R2 = sc.nextInt();
      for(int j=0;j<size;j++){
        if(S[j]>=R1 && S[j]<=R2)
          cnt++;
      }
      System.out.print(cnt+" ");
      cnt=0;
    }
  }
}