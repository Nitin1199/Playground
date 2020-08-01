import java.util.Scanner;
class Main
{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String nn = sc.nextLine();
    try{
     int n = Integer.parseInt(nn);
     if(n>0){
       while(n--!=0){
         int f= sc.nextInt();
         int b = sc.nextInt();
         int t = sc.nextInt();
         int d = sc.nextInt();
         int count = 0;
         int dist = 0;
         int time=0;
         if(f>=b || d==0 || t==0){
           System.out.println("Cannot park");
         }else
         {
           while(true)
           {
             if(dist + b<d){
               dist+=b;
             }
             else{
               time = (d-dist)*t;
               break;
             }
             dist = dist-f;
             count++;
           }
           time = time +(count*t)*(f+b);
           System.out.println(time);
         }
        
       }
     }
     else
       System.out.println("Invalid test case");
  }
  catch(Exception e)
  {
    System.out.println("Invalid test case");
  }
  }
}