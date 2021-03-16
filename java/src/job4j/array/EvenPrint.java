package job4j.array;

public class EvenPrint {
	
	public static void print(int[] array) {
		int endIndex;
		for (int i = 0; i < array.length; i++) {
			endIndex = array.length - 1 - i;
			if (array[endIndex] % 2 == 0) {
				System.out.println(array[endIndex]);
			}
		}
	}
}

/* 20. Вывести четные в порядке убывания индексов
 *
 * Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве четные числа в порядке убывания их индексов.
 * Для вывода использовать System.out.println()
 *
 * Например, для {1, 2, 3, 4} вывести 4, 2
 */
