package silicon;

import java.util.ArrayList;
import java.util.Scanner;

public class sort_20 {
	public static ArrayList<ArrayList<Integer>> pacaltriangle(int n) {
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		if (n < 1) {
			return arrayList;
		}
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		arrayList.add(array);
		if (n == 1) {
			return arrayList;
		}
		for (int i = 1; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			row.add(1);
			for (int j = 1; j < i; j++) {
				row.add(j, arrayList.get(i - 1).get(j - 1) + arrayList.get(i - 1).get(j));
			}
			row.add(1);
			arrayList.add(row);
		}
		return arrayList;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int m = scanner.nextInt();
			ArrayList<ArrayList<Integer>> arrayList = pacaltriangle(m);
			for (ArrayList a : arrayList) {
				System.out.println(a);
			}
		}

	}
}
