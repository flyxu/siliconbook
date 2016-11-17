package silicon;

import java.util.HashMap;

public class sort_2 {
	public int[] tosum(int[] A, int target) {
		int[] res = { -1, -1 };
		if (A == null || A.length < 2) {
			return res;
		}
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			hashMap.put(A[i], i);
		}
		for (int i = 0; i < A.length; i++) {
			if (hashMap.containsKey(target - A[i]) && (target - A[i] != A[i])) {
				res[0] = i;
				res[i] = hashMap.get(target - A[i]);
				break;
			}
		}
		return res;

	}

}
