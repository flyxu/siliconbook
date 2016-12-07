package silicon;

public class sort_62 {
	public int maxprofile(int[] price){
		if(price.length==0) return 0;
		int profit=0;
		int min=price[0];
		for(int i=0;i<price.length;i++){
			min=Math.min(min, price[i]);
			profit=Math.max(price[i]-min, profit);
		}
		return profit;
	}
}
