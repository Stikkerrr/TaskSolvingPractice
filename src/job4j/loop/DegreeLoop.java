package job4j.loop;

public class DegreeLoop {
	
	public static int calculate(int a, int n) {
		int rsl = 1;
		for (int i = 1; i <= n; i++) {
			rsl *= a;
		}
		return rsl;
	}
}

/* 7. Найти степень числа
 *
 * Дано целое число a и целое число degree (> 0).
 * Найти a в степени degree: a^degree = a·a· . . . ·a (числа a перемножаются degree раз).
 */
