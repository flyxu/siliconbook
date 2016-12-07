package silicon;

public class sort_67 {
	public int getMagnituePole(int[] A){
		if(A.length==0){
			return -1;
		}
		boolean[] iscurr=new boolean[A.length];
		int first=A[0];
		for(int i=0;i<A.length;i++){
			if(A[i]>=first){
				first=A[i];
				iscurr[i]=true;
			}
			
		}
		int second=A[A.length-1];
		for(int i=A.length-1;i>=0;i--){
			if(A[i]<=second){
				second=A[i];
				if(iscurr[i]){
					return i;
				}
			}
		}
		
		return -1;
	}

}
