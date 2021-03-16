package job4j.array;

import java.util.ArrayList;

public class ArrayWithoutEvenElements {
	
	public static int[] changeData(int[] data) {
		ArrayList<Integer> colRsl = new ArrayList<>();
		for (int datum : data) {
			if (datum % 2 == 0) {
				continue;
			}
			colRsl.add(datum);
		}
		return colRsl.stream().mapToInt(i -> i).toArray();
	}
}

/* 37. Массив без четных значений.
 *
 * Метод принимает массив целочисленных значений.
 * Необходимо перебрать этот массив выбрать из него только нечетные числа и вернуть новый массив,
 * в котором будут только нечетные числа.
 * При этом длина нового массива должна совпадать с количеством нечетных значений в исходном массиве.
 *
 * В этой задаче будет необходимо использовать оператор continue.
 */
