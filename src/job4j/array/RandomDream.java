package job4j.array;

public class RandomDream {
	
	public static String random(String[] prizes, int num) {
		return num <= prizes.length ? prizes[num - 1] :
				num % prizes.length == 0 ? prizes[prizes.length - 1] : prizes[num % prizes.length - 1];
	}
}

/* 44. Поле чудес
 *
 * Дан массив призов и положительное число, которое сгенерировано случайно. Ваша задача получить приз
 *
 * Например,
 *
 * {"автомобиль", "квартира", "билет"} и число = 1 => "автомобиль"
 *
 * {"автомобиль", "квартира", "билет"} и число = 2 => "квартира"
 *
 * {"автомобиль", "квартира", "билет"} и число = 4 => "квартира"
 *
 * {"автомобиль", "квартира", "билет"} и число = 99 => "билет"
 */
