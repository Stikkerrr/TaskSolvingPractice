package job4j.loop;

public class ModWithLoop {
	
	public static int mod(int n, int d) {
		int quotient = n / d;
		for (int i = 0; i < d; i++) {
			n -= quotient;
		}
		return n;
	}
}

/* 9.4. mod через while
 *
 * Есть операция остаток от деления %. Вам даны два целых положительных числа числа n и d (d > 0).
 * n это делимое, d это делитель. Вам нужно не используя операцию %, найти остаток от деления.
 */
