package job4j.array;

public class IndexMaxElement {
	
	public static int getIndexMax(int[] array) {
		return array[0] > array[array.length - 1] ? 0 : array.length - 1;
	}
}

/* 8. Индекс максимального значения
 *
 * Надеюсь, что Вы усвоили как необходимо обращаться к элементам массива в общем,
 * и к первому и последнему элементу в частности.
 *
 * В этом задании Вам необходимо расскомментировать код, добавить обращение к элементам массива по индексу и
 * исправить небольшую ошибку. Метод должен вернуть индекс элемента который является максимальным из двух:
 * первый элемент и последний элемент.
 */