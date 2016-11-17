package silicon;

import java.util.Arrays;

public class sort_1 {
	// 暴力法
	public boolean hassum1(int[] A, int target) {
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {

				if (A[i] + A[j] == target) {
					return true;

				}
			}
		}
		return false;
	}

	// 两指针
	public boolean hassum2(int[] A, int target) {
		boolean res = false;
		if (A == null || A.length < 2) {
			return false;
		}
		Arrays.sort(A);
		int i = 0;
		int j = A.length - 1;
		while (i < j) {
			if (A[i] + A[j] > target) {
				j--;
			} else if (A[i] + A[j] < target) {
				i++;
			} else {
				res = true;
				break;
			}

		}
		return res;
	}
}
