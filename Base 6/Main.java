import java.util.Scanner;
class Main
{
  static int base6(int p)
  {
    int q ,sum=0;
    while(p>0){
      q = p%6;
      sum+=q;
      p=p/6;
    }
    return sum;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int count=0;
    int n = sc.nextInt();
    int res;
    int a[] = new int[n];
    int b[] = new int[n];
    for(int i=0;i<n;i++){
    	a[i] =sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      res = base6(a[i]);
      b[i] = res;
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(i<j && b[i]>b[j])
          count++;
      }
    }
    System.out.print(count);
  }
}