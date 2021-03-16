package job4j.array;

public class CrossArray {
	
	public static void printCrossEl(int[] left, int[] right) {
		for (int value : left) {
			for (int i : right) {
				if (value == i) {
					System.out.println(value);
				}
			}
		}
	}
}

/* 2. Одинаковые элементы для массивов
 *
 * Заданы два числовых массива.
 *
 * Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.
 */
