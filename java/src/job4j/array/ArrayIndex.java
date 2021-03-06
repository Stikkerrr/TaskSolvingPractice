package job4j.array;

public class ArrayIndex {
	
	public static int getFirstElement(int[] array) {
		return array[0];
	}
	
	public static int getLastElement(int[] array) {
		return array[array.length-1];
	}
}

/* 5. Индексы в массивах
 *
 * Доступ к элементам в массивах осуществляется при помощи индексов, которые являются целочисленными значениями.
 * При этом индексация начинается с 0 и заканчивается значением имя_массива.length - 1.
 *
 * В задании необходимо расскомментировать, расставить значения индексов так,
 * чтобы первый метод возвращал первый элемент массива, а второй метод - последний элемент массива.
 */
