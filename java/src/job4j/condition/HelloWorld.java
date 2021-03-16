package job4j.condition;

public class HelloWorld {
	
	public static String checkNumber(int number) {
		String  firstStr  = "Hello";
		String  secondStr = "World";
		String  error     = "Operation not support";
		boolean check3    = number % 3 == 0;
		boolean check5    = number % 5 == 0;
		if (check3 && check5)
			return firstStr + ", " + secondStr + "!!!";
		else if (check3)
			return firstStr;
		else if (check5)
			return secondStr;
		else
			return error;
	}
}

/* 8. Hello World
 *
 * Метод принимает число. Необходимо проверить у этого числа следующие условия и при этом вернуть следующие результаты:
 *
 * 1. Если число делится на 3 без остатка - метод должен вернуть строку Hello;
 *
 * 2. Если число делится на 5 без остатка - метод должен вернуть строку World;
 *
 * 3. Если число делится на 3 и на 5 одновременно без остатка - метод должен вернуть строку Hello, World!!!
 *
 * 4. Если не выполнится ни одно из выше указанных условий - метод должен вернуть строку Operation not support.
 *
 * Для решения необходимо будет написать 2 булево выражения и там где это нужно объединить их правильным образом.
 */
