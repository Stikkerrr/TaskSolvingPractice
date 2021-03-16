package job4j.array;

public class Sorted {
	
	public static boolean isSorted(int[] array) {
		boolean rsl  = true;
		int     temp = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > temp) {
				temp = array[i];
			} else {
				rsl = false;
			}
		}
		return rsl;
	}
}

/* 1. Проверить сортировку массива
 *
 * Задана числовой массив. Необходимо написать программу, которая проверит, что массив отсортирован по возрастанию.
 *
 * Сортировать массив не нужно!
 */
