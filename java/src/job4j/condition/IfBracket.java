package job4j.condition;

public class IfBracket {
	
	public static void showA() {
		System.out.println("A");
	}
	
	public static void showB() {
		System.out.println("B");
	}
	
	public static void show(int num) {
		if (num > 1) {
			showA();
			showB();
		}
	}
}

/* 3.1. If. Забытые {}
 *
 * Отличие первого случая от второго, в том что showB() будет выполняться всегда,
 * а showA() только если будет выполнено условие.
 * Во втором, случае showA и showB будут выполняться только если условие выполнено.
 * {} позволяет записать несколько операторов внутри. Даже если нужно записать один оператор,
 * всегда пишите {}, чтобы не было ошибок и путаницы
 *
 * Поправьте ниже код, чтобы всегда вывод был только если выполнено условие
 */
