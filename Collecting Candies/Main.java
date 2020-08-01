
import java.util.*;

class Main{

public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
 long emptybox[]=new long[100009];
 long candybox[]=new long[100009];
 long a[]=new long[100009];
 long T,time=0, N;
 
 T=sc.nextLong();
 N=sc.nextLong();
 int i = 0;
 if( (T <= 10 && T >= 1) && (N <= 10000 && N >= 1)){
	 
 while (i < N ){
 a[i]=sc.nextLong();
  i++;
 }
 
  
   for(i = 0; i <= (N-1); i++)
 {
 candybox[i] = a[i];
 }
 for(i = 1; i < N; i++){
 candybox[i] = candybox[i-1] + candybox[i];
 emptybox[i-1] = candybox[i];
 }
 for(i = 0; i < N; i++){
 emptybox[i+1] = emptybox[i] + emptybox[i+1];
 time = emptybox[i+1];
 }
 System.out.print(time);
 }
}
}