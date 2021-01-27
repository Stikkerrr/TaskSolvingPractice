package job4j.array;

public class SwapCols {
	
	public static void swap(int[][] data, int src, int dst) {
		int temp;
		for (int i = 0; i < data.length; i++) {
			temp = data[i][src];
			data[i][src] = data[i][dst];
			data[i][dst] = temp;
		}
	}
}

/* 24. Переставить два столбца в матрице
 *
 * Ваша задача переставить два столбца в квадратной матрице. src, dest это индексы столбцов
 */
