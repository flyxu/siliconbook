package silicon;

public class sort_23 {
	public int index(int[] A, int target) {
		int low = 0;
		int high = A.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}
}
