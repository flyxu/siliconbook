package silicon;

public class sort_65 {
	public int maxArea(int A[]){
		int i=0;
		int j=A.length-1;
		int result=0;
		while(i<j){
			int area=Math.min(i, j)*(j-i);
			result=Math.max(area, result);
			if(A[i]<=A[j]){i++;}
			else{j--;}
		}
		return result;
		
	}
}	
