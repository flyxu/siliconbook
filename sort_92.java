package silicon;

import java.util.HashMap;

public class sort_92 {
	public int merge(HashMap<Integer, Integer> map,int right,int left){
		int upper=right+map.get(right)-1;
		int lower=left-map.get(left)+1;
		int len=upper-lower+1;
		map.put(upper, len);
		map.put(lower, len);
		return len;
	}
	
}
