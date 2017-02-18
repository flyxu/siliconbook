package silicon;

public class sort_71 {
	public static int maxsubarray(int[] A){
		if(A==null&&A.length==0)
			return 0;
		int[] dp=new int[A.length];
		for(int i=0;i<A.length;i++){
			dp[i]=0;
		}
		dp[0]=A[0];
		for(int i=1;i<A.length;i++){
			dp[i]=Math.max(dp[i-1]+A[i],A[i]);
		}
		int max=dp[0];
		for(int i=0;i<A.length;i++){
			if(dp[i]>max){
				max=dp[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] A={-3,1,-3,4,-1,2,1};
		System.out.println(maxsubarray(A));
	}
}
