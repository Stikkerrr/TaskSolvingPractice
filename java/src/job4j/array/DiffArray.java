package job4j.array;

import java.util.ArrayList;
import java.util.Arrays;

public class DiffArray {
	
	public static int[] diff(int[] left, int[] right) {
		if (Arrays.equals(left, new int[]{}) && Arrays.equals(right, new int[]{})) {
			return new int[]{};
		}
		if (Arrays.equals(left, new int[]{})) {
			return right;
		}
		if (Arrays.equals(right, new int[]{})) {
			return left;
		}
		ArrayList<Integer> rsl = new ArrayList<>();
		boolean            coincidence;
		for (int value : left) {
			coincidence = false;
			for (int i : right) {
				if (value == i) {
					coincidence = true;
					break;
				}
			}
			if (!coincidence) {
				rsl.add(value);
			}
		}
		return rsl.stream().mapToInt(i -> i).toArray();
	}
}

/* 48. Разность множеств
 *
 * Разность множеств это операция при которой в результирующее множество попадают элементы из первого множества, но только если их нет во втором множестве.
 *
 * Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов
 *
 * Например,
 *
 * {1}, {2} => {1}
 *
 * {1}, {1} => {}
 *
 * {1, 2}, {2} => {1}
 *
 * {1}, {} => {1}
 */
