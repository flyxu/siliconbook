package silicon;

import java.util.Arrays;
import java.util.Random;

public class sort_11 {
	public void numinrange(int[] intlist, int max, int min) {
		Arrays.sort(intlist);
		int range = max - min + 1;
		Random random = new Random();
		int result = random.nextInt(range) + min;
		while (Arrays.binarySearch(intlist, result) >= 0) {
			result = random.nextInt(range) + min;
		}
		System.out.println(result);
	}
}
