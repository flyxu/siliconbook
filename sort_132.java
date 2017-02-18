package silicon;

public class sort_132 {
	public boolean isPowerOf2(int n){
		if(n!=0&&(n&(n-1))==0){
			return true;
		}
		return false;
	}

}
