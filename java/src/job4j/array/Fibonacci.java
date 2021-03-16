package job4j.array;

public class Fibonacci {
	
	public static boolean checkArray(int[] data) {
		boolean rsl = true;
		for (int i = 2; i < data.length; i++) {
			if (data[i] != data[i - 2] + data[i - 1]) {
				rsl = false;
				break;
			}
		}
		return rsl;
	}
}

/* 38. Числа Фибоначчи.
 *
 * Числа Фибоначчи - это последовательность чисел, в котором каждое число начиная с третьего равно сумме двух предыдущих.
 * Например:
 *
 * 1, 3, 4, 7, 11, 18, 29, 47, 76....
 *
 * Вам необходимо реализовать метод, который проверит является ли последовательность целочисленных значений,
 * которая находится во входящем массиве, последовательностью чисел Фибоначчи. Метод должен вернуть true,
 * если последовательность чисел - числа Фибоначчи.
 */
