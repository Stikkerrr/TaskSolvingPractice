package job4j.array;

public class MergeRows {
	
	public static int[] merge(int[][] data) {
		int[] rsl   = new int[data.length * data.length];
		int   index = 0;
		for (int[] arr : data) {
			for (int val : arr) {
				rsl[index++] = val;
			}
		}
		return rsl;
	}
}

/* 25. Объединить строки квадратного массива
 *
 * Дана квадратная матрица. Ваша задача объединить ее строки в один массив
 *
 * Например, для {{1, 2}, {3, 4}} получить {1, 2, 3, 4}
 */
