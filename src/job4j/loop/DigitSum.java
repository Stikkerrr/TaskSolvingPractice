package job4j.loop;

public class DigitSum {
	
	public static int sum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}
}

/* 9.5. Сумма цифр
 *
 * Дано число, нужно получить сумму его цифр
 *
 * Например:
 * 12 => 1 + 2 => 3
 */
