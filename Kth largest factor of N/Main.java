import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc  = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int cnt=0;
    if(K==1)
      System.out.print(N);
    else{
    	K--;
      for(int i=N/2;i>=1;i--){
      	if(N%i == 0){
        	cnt++;
          	if(cnt == K){
            	System.out.print(i);
              	break;
            }
        }
        
      }
      if(cnt!= K)
          System.out.print("1");
    }
  }
}