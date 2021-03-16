package job4j.array;

public class RightDiagonal {
	
	public static int[] diagonal(int[][] data) {
		int[] rsl      = new int[data.length];
		int   index    = 0;
		int   endIndex = data.length - 1;
		for (int i = 0; i < data.length; i++) {
			for (int j = data[i].length; j >= 0; j--) {
				if (j == (endIndex - i)) {
					rsl[index++] = data[i][j];
				}
			}
		}
		return rsl;
	}
}

/* 26. Получить правую диагональ квадратного массива
 *
 * Вам дана квадратная матрица. Нужно получить правую диагональ. Правая диагональ это диагональ матрицы,
 * которая идет справа налево. Например, для {{1, 2}, {3, 4}} это будет {2, 3}, левой в этом случае будет {1, 4}
 */
