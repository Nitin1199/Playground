import java.util.Scanner;
class Main
{
  static int minproduct(int a[],int b[] ,int n,int k){
    int diff=0,res =0,temp =0;
    for(int i=0;i<n;i++){
      int pro = a[i]*b[i];
      res = res+pro;
      if(pro<0 && b[i]<0)
        temp = (a[i]-2*k)*b[i];
      else if(pro<0 && a[i]<0)
        temp = (a[i]-2*k)*b[i];
      else if(pro>0 && a[i]<0)
        temp = (a[i]+2*k)*b[i];
      else if(pro>0 && a[i]>0)
        temp = (a[i] -2*k)*b[i];
      
      int d= Math.abs(pro-temp);
      if(d>diff)
        diff= d;
    }
    return res-diff;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int mod = sc.nextInt();
    int A[] = new int[size];
    int B[] = new int[size];
    for(int i=0;i<size;i++){
      A[i] = sc.nextInt();
    }
    for(int i=0;i<size;i++){
      B[i] = sc.nextInt();
    }
    System.out.println(minproduct(A,B,size,mod));
  }
}