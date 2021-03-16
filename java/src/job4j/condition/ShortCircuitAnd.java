package job4j.condition;

public class ShortCircuitAnd {
	
	public static boolean showA() {
		System.out.println("A");
		return false;
	}
	
	public static boolean showB() {
		System.out.println("B");
		return false;
	}
	
	public static void main(String[] args) {
		if (showA() && showB()) {
		
		}
	}
}

/* 4. Операторы & и &&. Операторы | и ||
 *
 * Если написать &&, то будет выведено только "A", потому что первое выражение вернуло false.
 * Дело в том, что компилятор оптимизирует выражения. Если вернулось false, то уже не имеет смысла проверять дальше.
 * Аналогично true для ||
 *
 * Запомните, всегда пишите && и || в логических выражениях
 *
 * Ниже приведен код. Его нужно поправить
 */
