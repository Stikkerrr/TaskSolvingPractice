package job4j.array;

public class SubtractMinMax {
	
	public static int calculate(int[] ints) {
		int temp;
		int index;
		for (int i = 0; i < ints.length; i++) {
			temp = ints[i];
			index = i - 1;
			while (index >= 0 && ints[index] > temp) {
				ints[index + 1] = ints[index];
				index = index - 1;
			}
			ints[index + 1] = temp;
		}
		return ints[ints.length - 1] - ints[0];
	}
}

/* 57. Разница между минимумом и максимумом
 *
 * Метод принимает массив целочисленных значений, при этом это могут быть как положительные значения, так и отрицательные.
 * Необходимо реализовать в методе следующее:
 *
 * 1. Найти максимальное значение в массиве;
 *
 * 2. Найти минимальное значение в массиве;
 *
 * 3. Вернуть разницу между максимальным и минимальным значением в массиве.
 *
 * При этом массив не может быть пустым, поэтому дополнительная проверка, что длина массива больше 0 - не нужна.
 */
