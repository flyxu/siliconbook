package silicon;

public class sort_134 {
	public boolean ispowerof4(int n){
		if(n!=0&&((n&(n-1))==0)){
			if((n & 0xAAAAAAAA)==0){
				return true;
			}
		}
		return false;
	}
}
