package job4j.array;

public class EvenSumElements {
	
	public static boolean checkArray(int[] data) {
		int sum = 0;
		for (int datum : data) {
			sum += datum;
		}
		return sum % 2 == 0;
	}
}

/* 32. Сумма элементов массива - четное число?
 *
 * Метод принимает массив целочисленных значений. Метод должен определить сумму всех элементов в массиве,
 * проверить значение суммы является ли оно четным числом.
 */
