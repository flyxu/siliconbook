package silicon;

import java.util.HashMap;

public class sort_122 {
	public int fib(int n){
		if(n<=2) 
			return n;
		int a=1,b=1,i=3,res=0;
		while(i<=n){
			res=a+b;
			a=b;
			b=res;
			i++;
		}
		return res;
	}
	//扩展
	public int fibII(int n,HashMap<Integer, Integer> hm){
		if(n<=2)
			return 1;
		if(hm.containsKey(n)){
			return hm.get(n);
		}
		int res=fibII(n-1, hm)+fibII(n-2,hm);
		hm.put(n, res);
		return res;
	}

}
