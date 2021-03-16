package job4j.array;

public class Merge {
	
	public static int[] merge(int[] left, int[] right) {
		int[] rsl       = new int[left.length + right.length];
		int   indexLeft = 0, indexRight = 0, indexRsl = 0;
		while (indexLeft < left.length && indexRight < right.length) {
			if (left[indexLeft] <= right[indexRight]) {
				rsl[indexRsl++] = left[indexLeft++];
			} else {
				rsl[indexRsl++] = right[indexRight++];
			}
		}
		if (indexLeft == left.length) {
			while (indexRight < right.length) {
				rsl[indexRsl++] = right[indexRight++];
			}
		} else {
			while (indexLeft < left.length) {
				rsl[indexLeft++] = right[indexLeft++];
			}
		}
		return rsl;
	}
}

/* 3. Объединить два отсортированных массива
 *
 * Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
 */
