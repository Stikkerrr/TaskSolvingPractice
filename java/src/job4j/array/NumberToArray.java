package job4j.array;

import java.util.Arrays;

public class NumberToArray {
	
	public static int[] resolve(int number) {
		String temp  = String.valueOf(number);
		int[]  rsl   = new int[temp.length()];
		int    index = 0;
		for (int j = rsl.length - 1; j >= 0; j--) {
			rsl[index++] = Character.getNumericValue(temp.charAt(j));
		}
		return rsl;
	}
}

/* 41. Массив цифр
 *
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 *
 * Например
 *
 * 12345 => {5, 4, 3, 2, 1}
 */
