package silicon;

import java.util.Random;
//蓄水池抽样
//程序的开始就是把前k个元素都放到水库中，然后对之后的第i个元素，以k/i的概率替换掉这个水库中的某一个元素
public class sort_129 {
	public int[] randomsample(int[] A,int K){
		int[] B=new int[K];
		for(int i=0;i<A.length;i++){
			if(i<K)
				B[i]=A[i];
			else{
				Random random=new Random(i);
				int tmp=random.nextInt();
				if(tmp<K)
					B[tmp]=A[i];
			}
		}
		return B;
		
	}
}
