package job4j.condition;

public class LeapYear {
	
	public static boolean checkYear(int year) {
		int remainderOfDivisionBy400 = year % 400;
		int remainderOfDivisionBy100 = remainderOfDivisionBy400 % 100;
		int remainderOfDivisionBy4   = remainderOfDivisionBy100 % 4;
		if (remainderOfDivisionBy400 == 0) {
			return true;
		} else if (remainderOfDivisionBy100 == 0) {
			return false;
		} else return remainderOfDivisionBy4 == 0;
	}
}

/* 9. Високосный год.
 *
 * Всем нам известно такое понятие как високосный год - это год в котором в феврале по календарю 29 дней, а не 28 как во все остальные годы. Чтобы определить является ли год високосным, то он должен отвечать следующим критериям
 *
 * 1. год, номер которого кратен 400 - високосный;
 *
 * 2. остальные годы, номер которых кратен 100 - невисокосные (1700, 1800, 1900, 2100)
 *
 * 3. остальные годы, номер которых кратен 4 - високосные.
 *
 * Необходимо реализовать метод, который принимает целочисленное значение (номер года), и на выходе вернуть булево значение - true, если год високосный и false, если год невисокосный.
 */
