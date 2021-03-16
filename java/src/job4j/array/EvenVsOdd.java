package job4j.array;

public class EvenVsOdd {
	
	public static int whoWin(int[] players) {
		int sumOdd  = 0;
		int sumEven = players[0];
		for (int i = 1; i < players.length; i++) {
			if (i % 2 == 0) {
				sumEven += players[i];
			} else {
				sumOdd += players[i];
			}
		}
		return sumEven > sumOdd ? 1 : sumEven < sumOdd ? 2 : 0;
	}
}

/* 53. Четные vs Нечетные
 *
 * Вам даны очки игроков. Игроки разделись таким образом, что под четными индексами находятся очки первой команды,
 * под нечетными второй. Ваша задача определить, кто выиграл. Выигрывает та команда, которая набрала наибольшее число очков.
 * Если выиграла первая команда, то нужно вернуть 1, если вторая, то 2, если ничья то 0.
 */
