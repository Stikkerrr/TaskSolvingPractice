package job4j.array;

public class Sum {
	
	public static int getSum(int[] array) {
		return array[0] + array[array.length - 1];
	}
}

/* 6. Сумма элементов массива.
 *
 * Доступ к элементам массива осуществляется по индексам. Напомню, что первый элемент имеет индекс 0,
 * последний - имя_массива.length - 1.
 *
 * Вам необходимо реализовать метод, который принимает массив целочисленных значений и
 * возвращает сумму первого и последнего элемента в этом массиве.
 */
