package job4j.array;

import java.util.ArrayList;

public class OrArray {
	
	public static int[] or(int[] left, int[] right) {
		ArrayList<Integer> rsl = new ArrayList<>();
		for (int value : left) {
			rsl.add(value);
		}
		for (int value : right) {
			if (!rsl.contains(value)) {
				rsl.add(value);
			}
		}
		return rsl.stream().mapToInt(i -> i).toArray();
	}
}

/* 47. Объединение множеств
 *
 * Объединение множеств это такая операция при которой в результирующее множество попадают элементы,
 * которые есть хотя бы в одном множестве.
 *
 * Ваша задача реализовать эту операцию. Множества заданы в виде массива
 *
 * Например,
 *
 * {1}, {2} => {1, 2}
 *
 * {1, 2}, {2} => {1, 2}
 *
 * {1, 2}, {3} => {1, 2, 3}
 *
 * {1}, {} => {1}
 */
