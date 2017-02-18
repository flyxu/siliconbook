package silicon;



public class sort_76 {
	public int minCost(int h,int[] color){
		if(h==0||color.length==0)
			return 0;
		int[][] dp=new int[h][color.length];
		for(int i=0;i<color.length;i++){
			dp[0][i]=color[i];
		}
		for(int i=1;i<h;i++){
			for(int j=0;j<color.length;j++){
				int min=Integer.MAX_VALUE;
				for(int k=0;k<color.length;k++){
					if(k==j)
						continue;
					min=Math.min(min, dp[i-1][k]);
				}
				dp[i][j]=min+color[j];
			}
		}
		int min=Integer.MAX_VALUE;
		for(int j=0;j<color.length;j++){
			min=Math.min(min, dp[h-1][j]);
		}
		return min;
	}
	
}
