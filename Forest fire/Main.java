import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int fire_r = in.nextInt();
		int fire_c = in.nextInt();
		char forestlayout[][] = new char[r][c];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				forestlayout[i][j] = in.next().charAt(0);
			}
		}
		int timetaken= complete_total_burn_wrap(forestlayout,fire_r-1,fire_c-1,r,c);
		System.out.print(timetaken);
	}		
	public static int compute_total_burn_time(char forestlayout[][],int cr,int cc,int r,int c, int forestfiretime[][], int time){
		if((cr>=r) || (cr<0) || (cc>=c) || (cc<0))
			return 0;
		if(forestlayout[cr][cc]=='W')
			return 0;
		if((forestfiretime[cr][cc]!=Integer.MAX_VALUE) && (time>=forestfiretime[cr][cc]))
			return 0;
		forestfiretime[cr][cc]=time;
		
		compute_total_burn_time(forestlayout,cr,cc+1,r,c,forestfiretime,time+1);   
		compute_total_burn_time(forestlayout,cr,cc-1,r,c,forestfiretime,time+1);   
		compute_total_burn_time(forestlayout,cr+1,cc,r,c,forestfiretime,time+1);   
		compute_total_burn_time(forestlayout,cr-1,cc,r,c,forestfiretime,time+1);   
		compute_total_burn_time(forestlayout,cr+1,cc+1,r,c,forestfiretime,time+1);   
		compute_total_burn_time(forestlayout,cr-1,cc+1,r,c,forestfiretime,time+1);   
		compute_total_burn_time(forestlayout,cr+1,cc-1,r,c,forestfiretime,time+1);   
		compute_total_burn_time(forestlayout,cr-1,cc-1,r,c,forestfiretime,time+1);   
		return 0;
	}

	public static int complete_total_burn_wrap(char forestlayout[][],int fire_r, int fire_c, int r, int c)  {  
	    int forestfiretime[][] = new int[r][c];

	    for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                
                forestfiretime[i][j] = Integer.MAX_VALUE;
            }
        }
	    compute_total_burn_time(forestlayout,fire_r,fire_c,r,r,forestfiretime,1);
  
		int max_value=0;
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				if((forestfiretime[i][j]!= Integer.MAX_VALUE) && (max_value<forestfiretime[i][j]))
					max_value=forestfiretime[i][j];
			}
		}
		return max_value;  
	}
}	