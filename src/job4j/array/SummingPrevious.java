package job4j.array;

public class SummingPrevious {
	public static int[] calculate(int a, int b, int n) {
		int[] rsl = new int[n];
		rsl[0] = a;
		rsl[1] = b;
		int sum = a;
		for (int i = 2; i < n; i++) {
			sum += rsl[i-1];
			rsl[i] = sum;
		}
		return rsl;
	}
}

/* 18. Суммирования предыдущих значений
 *
 * Даны целые числа n (> 2), a и b. Сформировать и вывести целочисленный массив размера n,
 * первый элемент которого равен a, второй равен b, а каждый последующий элемент равен сумме всех предыдущих.
 */
