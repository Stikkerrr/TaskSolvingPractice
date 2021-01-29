package job4j.array;

public class RightShift {
	
	public static void shift(int[] nums, int count) {
		if (count > nums.length) {
			count = Math.abs(count % nums.length);
		}
		for (int n = 0; n < count; n++) {
			int buffer = nums[0];
			nums[0] = nums[nums.length - 1];
			for (int j = 1; j < nums.length - 1; j++) {
				nums[nums.length - j] = nums[nums.length - j - 1];
			}
			nums[1] = buffer;
		}
	}
}

/* 50. Циклический сдвиг вправо
 *
 * Ваша задача выполнить циклический сдвиг вправо с шагом count
 *
 * Например,
 *
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 *
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */