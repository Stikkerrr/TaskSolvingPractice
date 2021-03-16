package job4j.condition;

public class WeeklySalary {
	
	public static int calculate(int[] hours) {
		int overtime;
		int sum = 0;
		for (int i = 0; i < hours.length; i++) {
			overtime = hours[i] <= 8 ? 0 : hours[i] - 8;
			if (i == 5 || i == 6) {
				sum += (overtime * 15 + (hours[i] - overtime) * 10) * 2;
			} else {
				sum += overtime * 15 + (hours[i] - overtime) * 10;
			}
		}
		return sum;
	}
}

/* 10. Еженедельная зарплата
 *
 * Метод принимает массив целочисленных значений, при этом каждый элемент массива означает количество часов, которые работник отработал в каждый день недели. Работник может работать и в выходные. При этом оплачивается труд следующим образом:
 *
 * 1. В течение первых 8 часов каждый рабочий день за каждый час зарплата составляет 10 долларов.
 *
 * 2. За каждый отработанный час сверх нормы (8 часов) работник зарабатывает 15 долларов.
 *
 * 3. В выходные дни работодатель платит в два раза больше, как за каждый час по норме(первые 8 часов), так и сверхурочные.
 *
 * Необходимо реализовать метод, который посчитает общую сумму заработка за отработанную неделю.
 */
