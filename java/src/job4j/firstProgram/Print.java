package job4j.firstProgram;

public class Print {
	public static void main(String[] args) {
		System.out.print("Сегодня я молодец!");
	}
}

/* 3.3. Вывод без перехода на новую строку
 *
 * Иногда может потребоваться, чтоб выводилось без перехода на новую строку.
 * Обратите внимание метод System.out.println, имеет в конце ln, что с английского значит line,
 * что подразумевает вывод с переходом на новую строку. Существует другой метод System.out.print,
 * т.е. без ln. Он не переводит на новую строку. Пример,

   System.out.print("Hello Wordl!");

 * Различия можно увидеть, если заглянуть в консоль. Первый print, второй println
 * Выведите "Сегодня я молодец!" через System.out.print
 */

/* 3.1. Вывод информации на экран
 *
 * Чтобы вывести текст на экран в Java используется оператор.

	System.out.println("Hello, Job4j!");
	
 * Допишите программу приведенную ниже. Программа должна выводить на консоль строку "Hello, Job4j!"
 */

/* 3.2. Похвали себя за проделанную работу
 *
 * Напишите программу, которая вывод на консоль строчку "Сегодня я молодец!"
 */