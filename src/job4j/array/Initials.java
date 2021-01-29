package job4j.array;

public class Initials {
	public static String convert(String[] fio) {
		return fio[0] + " " + fio[1].charAt(0) + "." + fio[2].charAt(0) + ".";
	}
}

/* 40. Инициалы
 *
 * Дан массив из трех элементов. В нем записаны соответственно Фамилия Имя Отчество. Ваша задача получить инициалы.
 *
 * Например,
 *
 * "Иванов", "Роман", "Иваныч" -> "Иванов Р.И."
 */

