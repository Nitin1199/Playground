import java.util.Scanner;
class Main
{
  public static int no_of_children(int row,int col)
  {
    int count = 0;
    while(row>0 && col>0)
    {
      count++;
      if(row>col)
        row =row -col;
      else
        col = col - row;
    }
    return count;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int minlen = sc.nextInt();
    int maxlen = sc.nextInt();
    int minwid = sc.nextInt();
    int maxwid = sc.nextInt();
    for(int i = minlen;i<= maxlen; i++)
    {
      for(int j = minwid;j<= maxwid; j++)
      {
        sum = sum + no_of_children(i,j);
      }
    }
    System.out.print(sum);
  }
}