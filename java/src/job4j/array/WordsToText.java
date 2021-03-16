package job4j.array;

public class WordsToText {
	
	public static String convert(String[] words) {
		return String.join(" ", words);
	}
}

/* 42. Объединение слов
 *
 * Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 *
 * Например,
 *
 * {"one", "two", "three"} => "one two three"
 */
