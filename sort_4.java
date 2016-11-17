package silicon;

public class sort_4 {
	public void reverse(int[] A, int start, int end) {
		while (start < end) {
			int tmp = A[start];
			A[start] = A[end];
			A[end] = tmp;
			start++;
			end--;
		}

	}

	public int[] rightreverse(int[] A, int k) {
		if (A == null || A.length <= k) {
			return A;
		}

		reverse(A, 0, k - 1);
		reverse(A, k, A.length - 1);
		reverse(A, 0, A.length - 1);
		return A;
	}

}
