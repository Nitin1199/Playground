
import java.util.*; 
  
class Main { 
    static int min1 = Integer.MAX_VALUE; 
    static int count = 0; 
  
    // Find all the possible permutation of Value A. 
    public int permutation(String str1, int i, int n, int p) 
    { 
  
        if (i == n) { 
   
            int q = Integer.parseInt(str1); 
            if (q - p > 0 && q < min1) { 
                min1 = q; 
                count = 1; 
            } 
        } 
  
        else { 
            for (int j = i; j <= n; j++) { 
                str1 = swap(str1, i, j); 
                permutation(str1, i + 1, n, p); 
                str1 = swap(str1, i, j); 
            } 
        } 
        return min1; 
    } 
  
    // Swap two string character 
    public String swap(String str, int i, int j) 
    { 
        char ch[] = str.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        // Return the string after 
        // swapping between two character. 
        return String.valueOf(ch); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        
        int A=sc.nextInt();
        int B=sc.nextInt();
  
        Main gfg = new Main(); 
  
        // Convert integer value into string to 
        // find all the permutation of the number 
        String str1 = Integer.toString(A); 
        int len = str1.length(); 
        int h = gfg.permutation(str1, 0, len - 1, B); 
  
        // count=1 means number greater than B exists 
        if (count == 1) 
            System.out.println(h); 
        else
            System.out.println(-1); 
    } 
}