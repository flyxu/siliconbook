package silicon;

public class sort_75 {
	public int uniquepath(int m,int n){
		int[][] path=new int[m][n];
		path[0][0]=1;
		for(int i=0;i<n;i++){
			path[0][i]=1;
		}
		for(int j=0;j<m;j++){
			path[j][0]=1;
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				path[i][j]=path[i-1][j]+path[i][j-1];
			}
		}
		return path[m-1][n-1];
	}
}
