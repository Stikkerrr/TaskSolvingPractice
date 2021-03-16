package job4j.array;

public class Validator {
	
	public static boolean checkArray(int[] data, int value) {
		int counter = 0;
		for (int datum : data) {
			if (datum == value) {
				counter++;
			}
		}
		return counter < data.length / 2;
	}
}

/* 33. Проверка массива на уникальность элементов.
 *
 * Метод принимает массив целочисленных значений, а также число value, которое мы будем искать в этом массиве.
 * Метод должен посчитать количество одинаковых элементов которые совпадают с value,
 * и если окажется что это число больше или равно половине длины входного массива - массив считается невалидным и
 * метод должен вернуть false.
 */
