package job4j.loop;

public class OddCount {
	
	public static int count(int a, int b) {
		int counter = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 > 0) {
				counter++;
			}
		}
		return counter;
	}
}

/* 9.1. Найти количество нечетных в диапазоне
 *
 * Даны два целых положительных числа a и b (b > a).
 * Найти количество нечетных чисел в диапазоне [a, b].
 * Нечетным считается число, у которого остаток от деления на 2 равен 1
 */
