package silicon;

import java.util.Arrays;

public class sort_10 {
	public int[] closestBigger(int[] x, int[] y) {
		Arrays.sort(x);
		int res[] = new int[x.length];
		boolean used[] = new boolean[x.length];
		int k = 0;
		for (int j = 0; j < y.length; j++) {
			int i = 0;
			while (x[i] < y[j] || used[i]) {
				i++;
			}
			res[k++] = x[i];
			used[i] = true;
			if (x[i] > y[j]) {
				for (int n = 0; n < x.length; n++) {
					if (!used[n]) {
						res[k++] = x[n];
					}
				}
				break;
			}
		}
		return res;

	}
}
