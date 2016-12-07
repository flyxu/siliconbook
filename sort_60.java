package silicon;

public class sort_60 {
	public int removeduplicate(int A[]){
		int i=0;
		int j;
		if(A.length<=1)
			return A.length;
		for(j=1;i<A.length;i++){
			if(A[i]==A[j]){
				continue;
			}
			else{
				A[++i]=A[j];
			}
			
		}
		return i+1;
	}
//扩展问题
	public int removeduplicate2(int A[]){
		int n=A.length;
		if(n<=2){
			return n;
		}
		int i=1;
		int j=2;
		for(j=2;j<n;j++){
			if(A[i]!=A[j]&&A[j]!=A[i-1]){
				A[++i]=A[j];
			}
		}
		return i+1;
	}
}
