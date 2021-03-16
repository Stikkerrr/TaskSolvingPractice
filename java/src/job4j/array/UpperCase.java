package job4j.array;

public class UpperCase {
	
	public static char[] toUpperCase(char[] string) {
		char[] rsl = new char[string.length];
		for (int i = 0; i < string.length; i++) {
			if (Character.isLowerCase(string[i])) {
				rsl[i] = Character.toUpperCase(string[i]);
			} else {
				rsl[i] = string[i];
			}
		}
		return rsl;
	}
}

/* 27. Привести строку к верхнему регистру
 *
 * Дана строка, записанная в виде массив символов. Ваша задача создать новую строку,
 * в которой будут в символы исходной в верхнем регистре. Если символ не является буквой, например цифры или -,
 * то просто записать в результат.
 *
 * Например, для a-123-B, получить A-123-B
 *
 * Использовать доп. методы
 *
 * Character.isLowerCase(c), где c исходный символ
 *
 * Character.toUpperCase(c), где c исходный символ
 */