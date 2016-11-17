package silicon;

public class sort_5 {
	public int maxindex(int A[]) {
		if (A == null || A.length < 2) {
			return 0;
		}
		boolean dec[] = new boolean[A.length];
		int min = A[0];
		dec[0] = true;
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
				dec[i] = true;
			}
		}
		int i = A.length - 1;
		int j = A.length - 1;
		int maxdist = 0;
		while (i >= 0) {
			if (dec[i] == false) {
				i--;
				continue;
			}
			while (A[j] < A[i] && j > i) {
				j--;
			}
			if ((j - i) > maxdist) {
				maxdist = j - i;
			}
			i--;
		}
		return maxdist;
	}
}
