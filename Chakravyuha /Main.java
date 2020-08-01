import java.util.*;

class Main{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
  int n;
  n=sc.nextInt();
  int i, j, count = 0, index = 2;
  int arr[][]=new int[n][n];
  int points[]=new int[10000];
  points[0] = 0;
  points[1] = 0;
  //to know how many spiral i am going to form
  for(i = 0; i <(n+1)/2; i++)
  {
    //to move rightwards
    for(j = i; j <= n-i-1; j++)
    {
      arr[i][j] = ++count;
      if(count % 11 == 0)
      {
        points[index++] = i;
        points[index++] = j;
      }
    }
    //to move downwards
    for(j = i+1; j <= n-i-1; j++)
    {
      arr[j][n-i-1] = ++count;
      if(count % 11 == 0)
      {
        points[index++] = j;
        points[index++] = n-i-1;
      }
    }
    //to move leftwards
    for(j = n-i-2; j>= i; j--)
    {
      arr[n-i-1][j] = ++count;
      if(count % 11 == 0)
      {
        points[index++] = n-i-1;
        points[index++] = j;
      }
    }
    //to move upwards
    for(j = n-i-2; j>i; j--)
    {
      arr[j][i] = ++count;
      if(count % 11 == 0)
      {
        points[index++] = j;
        points[index++] = i;
      }
    }
  }
  for(i = 0; i < n; i++)
  {
    for(j = 0; j < n; j++)
    {
        System.out.print(arr[i][j]+"\t");
      
    }
    System.out.println();
  }
  //print the total power point values
  
  System.out.println( "Total Power points : "+index/2);
  //printing all the power point values
  for( i = 0; i < index; i+=2)
  {
      System.out.println("("+points[i]+", "+points[i+1]+")");
    
      }
}
}