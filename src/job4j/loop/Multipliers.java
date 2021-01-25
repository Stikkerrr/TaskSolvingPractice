package job4j.loop;

import java.util.ArrayList;

public class Multipliers {
	
	public static void out(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
		ArrayList<Integer> printRes = new ArrayList<>();
		printRes.add(1);
		printRes.add(n);
		int comparisonBorder = (int) Math.ceil(Math.sqrt(n));
		for (int i = 2; i < comparisonBorder; i++) {
			if (n % i == 0) {
				printRes.add(printRes.size() / 2, i);
				printRes.add(printRes.size() / 2 + 1, n / i);
			}
		}
		if (comparisonBorder == Math.sqrt(n)) {
			printRes.add(printRes.size() / 2, comparisonBorder);
		}
		for (Integer printRe : printRes) {
			System.out.println(printRe);
		}
	}
}

/* 8. Вывести делители числа
 *
 * Дано целое число n (> 0). Нужно вывести делители числа. Делитель это число на которое делится заданное число
 *
 * Например,
 *
 * Для 1, это 1
 *
 * Для 2, это 1 и 2
 *
 * Для 6, это 1, 2, 3, 6
 *
 * Для 7, это 1, 7
 */