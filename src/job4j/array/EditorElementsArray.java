package job4j.array;

public class EditorElementsArray {
	
	public static int[][] changeData(int[][] array, int el) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > el) {
					array[i][j] = array[i][j] - el;
				} else {
					array[i][j] = 0;
				}
			}
		}
		return array;
	}
}

/* 34. Изменить элементы двумерного массива.
 *
 * Метод принимает двумерный массив произвольного размера, в котором может быть сколько угодно рядов,
 * а также произвольное число элементов в ряду. Необходимо перебрать массив и
 * сравнить каждый элемент со значением el которое мы передаем в параметрах метода. При этом:
 *
 * 1. Если элемент массива больше значения el - элемент массива нужно заменить на разность
 * между текущим значением элемента массива и значения el.
 *
 * 2. Если элемент массива меньше или равен el - необходимо заменить текущий элемент массива 0.
 */