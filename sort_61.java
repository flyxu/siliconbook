package silicon;

import java.util.ArrayList;
import java.util.Arrays;

public class sort_61 {
	public ArrayList<ArrayList<Integer>> threesum(int[] num){
		ArrayList<ArrayList<Integer>> resSet=new ArrayList<ArrayList<Integer>>();
		if(num.length<3){
			return resSet;
		}
		Arrays.sort(num);
		for(int i=0;i<num.length-2;i++){
			if(num[i]>0) break;
			if(i>0&&num[i]==num[i-1]) 
				continue;
			int sheyu=0-num[i];
			int j=i+1;
			int k=num.length-1;
			while(j<k){
				if(num[j]+num[k]<sheyu){
					j++;
				}
				else if(num[j]+num[k]>sheyu){
					k++;
				}
				else{
					ArrayList<Integer> arrayList=new ArrayList<>();
					arrayList.add(num[i]);
					arrayList.add(num[j]);
					arrayList.add(num[k]);
					resSet.add(arrayList);
					do{j++;}while(j<k&&num[j]==num[j-1]);
				}
			}
					}
		return resSet;
	}
	
	public static ArrayList<ArrayList<Integer>> threesum2(int[] num){
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		if(num.length<3)
			return result;
		Arrays.sort(num);
		for(int i=0;i<num.length;i++){
			if(num[i]>0)
				break;
			if(i>0&&num[i]==num[i-1])
				continue;
			int start=i+1;
			int end=num.length-1;
			int sum=num[i]+num[start]+num[end];
			if(sum<0){
				start++;
			}
			else if(sum>0)
			{
				end--;
			}
			else{
				ArrayList<Integer> arrayList=new ArrayList<>();
				arrayList.add(num[i]);
				arrayList.add(num[start]);
				arrayList.add(num[end]);
				result.add(arrayList);
				do{start++;}while(start<end&&num[start]==num[start-1]);
				do{end--;}while(start<end&&num[end+1]==num[end]);
			}
			
		}
		return result;
	}
}
