package silicon;

public class sort_72 {
	public int minpathsum(int[][] grid){
		int m=grid.length;
		int n=grid[0].length;
		int[][] path=new int[m][n];
		//p[i][j]以i,j结尾的最短的最小路径和
		path[0][0]=grid[0][0];
		for(int i=1;i<m;i++){
			path[i][0]=path[i-1][0]+grid[i][0];//边界情况
		}
		for(int j=1;j<n;j++){
			path[0][j]=path[0][j-1]+grid[0][j];
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				path[i][j]=Math.min(path[i-1][j]+grid[i][j], path[i][j-1]+grid[i][j]);
			}
		}
		return path[m-1][n-1];
	}
}
