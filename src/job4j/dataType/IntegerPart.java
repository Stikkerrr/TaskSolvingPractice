package job4j.dataType;

public class IntegerPart {
	public static void main(String[] args) {
		float floatNum = 2.6f;
		int integerNum = (int) floatNum;
		System.out.println(integerNum);
	}
}

/* 5. Целая часть вещественного числа
 *
 * Иногда бывает нужным, что получить целую часть числа вещественного числа.
 * Заметьте не округлить в сторону целого, а получить целую часть, т.е если есть число 2.9, нам нужно получить 2.
 *
 * Для этого мы можем сделать приведение типов. Из вещественного числа в целое. Например:
 *
 * double floatNum = 1.5;
 * long integerNum = (long) floatNum;
 * integerNum в итоге будет 1.
 *
 * Ниже приведен код, расскоментируйте его и приведете вещественное число к целому
 */
