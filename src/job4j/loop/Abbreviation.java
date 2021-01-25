package job4j.loop;

public class Abbreviation {
	
	public static String collect(String s) {
		StringBuilder rsl = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				rsl.append(s.charAt(i));
			}
		}
		return rsl.toString();
	}
}

/* 13. Аббревиатуры
 *
 * Аббревиатуры стали неотъемлемой частью нашей жизни. Мы очень часто используем и много какие выражения сокращаем,
 * забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
 *
 * Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
 * Необходимо из полученной строки сформировать аббревиатуру.
 *
 * Для формирования новой строки используйте StringBuilder и его метод append().
 */