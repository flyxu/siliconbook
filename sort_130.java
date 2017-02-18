package silicon;

import java.util.Arrays;

public class sort_130 {
	public static int[] getproduct(int[] A){
		int[] B=new int[A.length];
		for(int i=0;i<A.length;i++){
			if(i==0) B[i]=1;
			else{
				B[i]=A[i-1]*B[i-1];
			}
		}
		int right=A[A.length-1];
		for(int i=A.length-2;i>=0;i--){
			B[i]=B[i]*right;
			right=A[i]*right;
		}
		return B;
	}
		public static int[] getproduct2(int[] A){
		int[] B=new int[A.length];
		int[] C=new int[A.length];
		
		for(int i=0;i<A.length;i++){
			if(i==0) B[i]=1;
			else{
			B[i]=B[i-1]*A[i-1];
			}
		}
		for(int i=A.length-1;i>=0;i--)
		{
			if(i==A.length-1){
				C[i]=1;
			}
			else{
				C[i]=C[i+1]*A[i+1];
			}	
		}
		for(int i=0;i<A.length-1;i++){
			B[i]=B[i]*C[i];
		}
		return B;	
	}
	public static void main(String[] args) {
		int[] A={1,2,3,4};
		int[] B=getproduct2(A);

		System.out.println((Arrays.toString(B)));
	}

}
