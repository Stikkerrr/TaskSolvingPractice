package job4j.array;

public class ArrayInSquareArray {
	
	public static int[][] convertArray(int[] array) {
		int     indexRsl = (int) Math.ceil(Math.sqrt(array.length));
		int[][] rsl      = new int[indexRsl][indexRsl];
		int     index    = 0;
		for (int i = 0; i < rsl.length; i++) {
			for (int j = 0; j < rsl[i].length; j++) {
				if (index < array.length) {
					rsl[i][j] = array[index++];
				}
			}
		}
		return rsl;
	}
}

/* 30. Превратить одномерный массив в двумерный.
 *
 * Метод принимает массив целочисленных значений. Необходимо реализовать метод,
 * который превратит одномерный массив в квадратный двумерный. Напомню, что квадратный двумерный массив - это массив,
 * в котором число рядов и элементов в каждом ряду одинаково. При этом если элементов в исходном массиве не хватает,
 * чтобы заполнить весь двумерный массив - необходимо заполнить его 0.
 */
