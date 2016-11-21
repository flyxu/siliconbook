package silicon;

import java.util.Arrays;

public class sort_19 {
	public static int[] mergesortedarrays(int A[], int m, int B[], int n) {
		int len = A.length + B.length;
		int[] result = new int[len];
		while (n > 0 && m > 0) {
			if (A[m - 1] < B[n - 1]) {
				result[n + m - 1] = B[n - 1];
				n--;

			} else {
				result[n + m - 1] = A[m - 1];
				m--;
			}
		}
		if (m != 0) {
			for (int i = 0; i < m - n; i++) {
				result[i] = A[i];
			}
		} else {
			for (int i = 0; i < n - m; i++) {
				result[i] = B[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 7, 10 };
		int[] B = { 2, 3, 5, 8, 9, 11 };
		System.out.println(Arrays.toString(mergesortedarrays(A, 5, B, 6)));
	}
}
