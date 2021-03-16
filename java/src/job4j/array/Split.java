package job4j.array;

import java.util.ArrayList;

public class Split {
	
	public static char[][] split(char[] str, char c) {
		ArrayList<ArrayList<Character>> preRsl = new ArrayList<>();
		ArrayList<Character>            temp   = new ArrayList<>();
		for (char value : str) {
			if (value != c) {
				temp.add(value);
			} else {
				preRsl.add(temp);
				temp = new ArrayList<>();
			}
		}
		preRsl.add(temp);
		char[][] result = new char[preRsl.size()][];
		for (int i = 0; i < preRsl.size(); i++) {
			result[i] = new char[preRsl.get(i).size()];
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = preRsl.get(i).get(j);
			}
		}
		return result;
	}
}

/* 52. split
 *
 * В классе String есть метод split(), этот метод делит строки на части по разделителю. Ваша задача написать его аналог
 *
 * Например (запись идет через строки для удобства)
 *
 * "1 2", ' ' => {"1", "2"}
 *
 * "12", ' ' => {"12"}
 */
