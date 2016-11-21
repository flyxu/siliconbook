package silicon;

import java.util.Arrays;

public class sort_12 {
	public static int partition(int[] array, int low, int end) {
		if (low > end) {
			return -1;
		}
		int tmp = array[low];
		while (low < end) {
			while (low < end && array[end] >= tmp) {// 这里是>=,只是>会陷入无限循环中，比如(2,4,2)
				end--;
			}
			array[low] = array[end];
			while (low < end && array[low] <= tmp) {// 这里是<=
				low++;
			}
			array[end] = array[low];
		}
		array[low] = tmp;
		return low;
	}

	public static int[] gettop(int[] data, int k) {
		int[] result = new int[k];
		int start = 0;
		int end = data.length - 1;
		int index = partition(data, start, end);
		while (index != k - 1) {
			if (index > k - 1) {
				end = index - 1;
				index = partition(data, start, end);

			} else {
				start = index + 1;
				index = partition(data, start, end);
			}
		}
		for (int i = 0; i < k; i++) {
			result[i] = data[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] data = { 5, 2, 4, 8, 9, 2, 1 };
		System.out.println(Arrays.toString(gettop(data, 5)));
	}
}
