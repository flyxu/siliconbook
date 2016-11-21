package silicon;

public class sort_24 {
	public void setzeros(int[][] matrix) {
		int m = matrix.length;
		if (m == 0)
			return;
		int n = matrix[0].length;
		int x = -1;
		int y = -1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					if (x == -1 && y == -1) {
						x = i;
						y = i;
					} else {
						matrix[x][j] = 0;
						matrix[i][y] = 0;
					}
				}

			}
		}
		if (x == -1 && y == -1)
			return;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[x][j] == 0 || matrix[i][y] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

	}

}
