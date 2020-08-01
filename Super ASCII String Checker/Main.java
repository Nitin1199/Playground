import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int numbers[] = new int[26];
    for(int i=0;i<26;i++){
      numbers[i] = 0;
    }
    boolean isAscii;
    int n = sc.nextInt();
    while(n--!=0){
      String s = sc.next();
      isAscii = true;
      for(int i=0;i<s.length();i++){
        if((s.charAt(i)>='a') && (s.charAt(i)<='z'))
        {
          numbers[s.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(numbers[i]>0 && (numbers[i]!=(i+1)))
        {
          isAscii = false;
        }
        numbers[i] = 0;
      }
      if(isAscii){
      	System.out.print("YES ");
      }
      else{
      	System.out.print("NO ");
      }
    }
  }
}