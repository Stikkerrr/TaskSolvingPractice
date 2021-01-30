package job4j.array;

public class PositiveOrNegative {
	
	public static boolean check(int[] data) {
		int counterPositive = 0;
		int counterNegative = 0;
		for (int datum : data) {
			if (datum < 0) {
				counterNegative++;
			} else {
				counterPositive++;
			}
		}
		return (counterNegative % 2 != 0) && (counterPositive % 2 != 0);
	}
}

/* 55. Четное или нечетное количество отрицательных значений
 *
 * Метод принимает массив целочисленных значений. При этом массив может содержать как положительные значения,
 * так и отрицательные, но не может содержать 0.
 *
 * Необходимо реализовать метод таким образом, чтобы он вернул булево значение следующим образом:
 *
 * 1. true - количество отрицательных значений в массиве нечетное число;
 *
 * 2. false - количество положительных значений в массиве четное число.
 */
