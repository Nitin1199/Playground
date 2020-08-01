import java.util.*;
import java.lang.*;

class Main{

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int test_case = sc.nextInt();
  
  for(int i = 1; i <= test_case; i++)
  {
    int tables, attendees, PA, PB, TA, TB, j;
    
    tables=sc.nextInt();
    attendees=sc.nextInt();
    long fact[]=new long[attendees + 2];
    long divide, arrange;
    //for cases where tables are greater than the number of attendees
    if(tables >= attendees)
    {
        System.out.println("1");
    }
    //for all other cases
    else
    {
      //find the number of attendees to be seated in each type A and type B table
      PA = attendees / tables;
      PB = PA + 1;
      //find the number of type A and type B tables
      TB = attendees % tables;
      TA = tables - TB;
      //calculating the factorial values and storing in an array
      fact[0] = 1;
      for(j = 1; j <= attendees + 1; j++)
      {
        fact[j] = j * fact[j-1];
      }
      //Dividing people between tables
      divide = fact[attendees] / (int)((Math.pow(fact[PA], TA) * (Math.pow(fact[PB], TB) * fact[TA] * fact[TB])));
      //Arranging the people after dividing them
      if(PB >= 4)
      {
        arrange = divide * (int)((Math.pow(fact[PA - 1] / 2, TA) * (Math.pow((fact[PB - 1] / 2), TB))));
      }
      else
      {
        arrange = divide;
      }
      System.out.println(arrange);
	
    }
  }
}
}