package job4j.array;

public class OddPrint {
	
	public static void print(int[] array) {
		for (int value : array) {
			if (value % 2 == 1) {
				System.out.println(value);
			}
		}
	}
}

/* 19. Вывести нечетные в порядке возрастания индексов
 *
 * Дан целочисленный массив размера N.
 * Вывести все содержащиеся в данном массиве нечетные числа в порядке возрастания их индексов.
 * Для вывода использовать System.out.println()
 */
