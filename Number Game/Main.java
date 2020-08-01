import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    int a[] = new int [n];
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      sum = sum^a[i];
    }
    if(sum == 0){
      System.out.print("JASBIR");
    }
    else{
      System.out.print("AMAN");
    }
  }
}