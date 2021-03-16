package job4j.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SymmetricDiff {
	
	public static int[] diff(int[] left, int[] right) {
		if (Arrays.equals(left, new int[]{}) && Arrays.equals(right, new int[]{})) {
			return new int[]{};
		}
		if (Arrays.equals(left, new int[]{})) {
			return right;
		}
		if (Arrays.equals(right, new int[]{})) {
			return left;
		} else {
			ArrayList<Integer>  rsl  = new ArrayList<>();
			LinkedList<Integer> temp = new LinkedList<>();
			for (int i : right) {
				temp.add(i);
			}
			boolean cons = true;
			for (int value : left) {
				for (int j = 0; j < temp.size(); ) {
					if (value == temp.get(j)) {
						cons = false;
						temp.remove(j);
						break;
					} else {
						j++;
					}
				}
				if (cons) {
					rsl.add(value);
				}
			}
			if (!rsl.isEmpty()) {
				rsl.addAll(temp);
			}
			return rsl.stream().mapToInt(i -> i).toArray();
		}
	}
}

/* 49. Симметрическая разность множеств
 *
 * Симметрическая разность - это такая операция, когда в результирующее множество попадают все элементы из обоих множеств, кроме тех, которые есть и в том и в другом множествах.
 *
 * Ваша задача реализовать эту операцию. Множества заданы в виде массивов.
 *
 * Например,
 *
 * {1}, {2} => {1, 2}
 *
 * {1, 2}, {2, 3} => {1, 3}
 *
 * {1}, {} => {1}
 */
