package silicon;

import java.util.Arrays;

public class sort_21 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[] A = new int[m * n];
		for (int k = 0; k < m * n; k++) {
			int i = k / n;
			int j = k % n;
			A[k] = matrix[i][j];
		}
		if (Arrays.binarySearch(A, target) >= 0) {
			return true;
		}
		return false;
	}

	public static boolean searchmatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int low = 0;
		int high = m * n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (matrix[mid / n][mid % n] == target) {
				return true;
			} else if (matrix[mid / n][mid % n] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 7, 8, 9 } };
		System.out.println(searchMatrix(A, 7));
		System.out.println(searchmatrix(A, 1));

	}

}
