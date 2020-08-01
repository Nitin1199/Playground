import java.util.*;
class Main
{
  public static void main(String args[])
  {
   int cases;
   Scanner sc = new Scanner(System.in);
   cases = sc.nextInt();
   int array[] = new int[cases];
   for(int i=0;i<array.length;i++){
     array[i]=sc.nextInt();
   }
   for(int j=0; j<array.length ;j++){
     int counter=0;
     int num = array[j];
     while(num>0){
       num=num/2;
       counter++;
     }
     System.out.println(counter);
   }
  }
}