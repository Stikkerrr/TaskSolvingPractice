package job4j.dataType;

public class IntegerTypeConversion {
	
	public static void main(String[] args) {
		int   num      = 1;
		long  numUpper = num;
		short numLower = (short) num;
		System.out.println(numUpper);
		System.out.println(numLower);
	}
}

/* 3. Приведение типов. Целые числа
 *
 * В Java существуют различные примитивные типы для целых чисел (byte, short, int, long). Местами в программе, у нас могут быть переменные одного типа, а работать нужно с другим типом. Правило простое, если:
 *
 * 1. Если переменная куда мы хотим поместить значение из другой переменной по типу весит больше больше, т.е. может включать больше чисел, то мы можем просто поместить значение
 *
 * 2. В противном случае нам нужно делать явное приведение типов. Но при этом мы можем потерять часть данных. Применять нужно с осторожностью
 *
 * тип1 переменная1 = (тип1) переменная2;
 *
 * Пример:
 *
 * // Ситуация 1
 * int a = 1;
 * long b = a;
 * // Ситуация 2
 * short c = 2;
 * byte d = (byte) c;
 *
 * Ниже приведен код. Вам нужно раскоментировать строки и сделать приведение типов
 */