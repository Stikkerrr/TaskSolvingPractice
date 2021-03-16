package job4j.array;

public class MaxLengthSeria {
	
	public static int find(int[] array) {
		int counter   = 1;
		int lastIndex = array.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			if (array[i + 1] >= array[i]) {
				counter++;
			} else {
				counter = 1;
			}
		}
		return counter;
	}
}

/* 22. Максимальная длина неубывающей последовательности
 *
 * Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m она называется неубывающей.
 * Длина последовательности это количество элементов, которые в нее входят.
 * В массиве таких последовательностей может быть несколько, вам нужно найти длину максимальной из них.
 *
 * Для пример, взгляните на тесты
 */
