package silicon;

import java.util.Arrays;

public class sort_63 {
	public static int[] sortcolors(int[] A){
		int red=0;
		int blue=A.length-1;
		
		for(int i=red;i<blue;i++){
			
			if(A[i]==0){
				int tmp=A[red];
				A[red]=A[i];
				A[i]=tmp;
				red++;
			}
			else if(A[i]==2){

				int tmp=A[blue];
				A[blue]=A[i];
				A[i]=tmp;
				i--;
				blue--;
			}
		}
		
		
		return A;
	}
	public static void main(String[] args) {
		int[] A={1,1,2};
		System.out.println(Arrays.toString(sortcolors(A)));
	}
}
