package silicon;

import java.util.ArrayList;

public class sort_73 {
	public int minimumTotal2(ArrayList<ArrayList<Integer>> triangle){
		ArrayList<Integer> path=new ArrayList<Integer>();
		for(int i=triangle.size()-1;i>=0;i--){
			for(int j=0;j<=i;j++){
				if(i==triangle.size()-1)
					path.add(triangle.get(i).get(j));
				else{
					path.set(j, triangle.get(i).get(j)+Math.min(path.get(j), path.get(j+1)));
				}
			}
			
		}
		return path.get(0);
	}
}
