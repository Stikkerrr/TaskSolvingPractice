package job4j.array;

import java.util.ArrayList;

public class Anomaly {
	
	public static int[][] found(int[] data, int up, int down) {
		ArrayList<ArrayList<Integer>> preRsl = new ArrayList<>();
		ArrayList<Integer>            temp   = new ArrayList<>();
		for (int i = 0; i < data.length; ) {
			if (data[i] <= down) {
				do {
					temp.add(i++);
				} while (i < data.length && data[i] <= down);
				preRsl.add(temp);
				temp = new ArrayList<>();
			} else if (data[i] >= up) {
				do {
					temp.add(i++);
				} while (i < data.length && data[i] >= up);
				preRsl.add(temp);
				temp = new ArrayList<>();
			} else {
				i++;
			}
		}
		if (preRsl.isEmpty()) {
			return new int[][]{};
		} else if (preRsl.size() == 1 && preRsl.get(0).size() == 1) {
			return new int[][]{{preRsl.get(0).get(0), preRsl.get(0).get(0)}};
		} else {
			int[][] result = new int[preRsl.size()][];
			for (int i = 0; i < preRsl.size(); i++) {
				result[i] = new int[preRsl.get(i).size()];
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = preRsl.get(i).get(j);
				}
			}
			return result;
		}
	}
}

/* 54. Аномалии
 *
 * Назовем аномалиями диапазоны индексов, на которых значения массива меньше или равно down или больше или равно up.
 * Ваша задача найти все аномалии в массиве. Если в аномалии одно, число то нужно вернуть диапазон [i, i] -
 * где i индекс числа выходящего за границы.
 *
 * Например,
 *
 * {5, 10, 15}, up = 16, down = 4 => аномалий нет
 *
 * {5, 4, 15}, up = 16, down = 4 => {{1, 1}}
 *
 * {5, 4, 3, 15}, up = 16, down = 4 => {{1, 2}}
 *
 * {5, 10, 15, 1, 2}, up = 16, down = 4 => {{3, 4}}
 */
