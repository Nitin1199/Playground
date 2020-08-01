import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int num,star=0;
    int lterm;
    int rterm;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    lterm=1;
    rterm = num*num+1;
    for(int i=num;i>0;i--)
    {
      for(int s=1;s<=star;s++)
      {
        System.out.print("*");
      }
      star+=2;
      for(int j=1;j<=i;j++)
      {
        System.out.print(lterm+"0");
        lterm++;
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print(rterm);
        if(j<i){
          System.out.print("0");
        }
        rterm++;
      }
      rterm = rterm-(i-1)*2-1;
      System.out.print("\n");
    }
  }
}