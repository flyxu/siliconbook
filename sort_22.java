package silicon;

import java.util.Arrays;

public class sort_22 {
	public static int[] startandend(int[] A, int target) {
		int i = 0;
		int j = 0;
		while (A[i] < target) {
			i++;
		}
		while (A[j] <= target) {
			j++;
		}
		int[] result = new int[2];
		result[0] = i;
		result[1] = j - 1;
		return result;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 4, 4, 5 };
		System.out.println(Arrays.toString(startandend(A, 4)));
	}
}
