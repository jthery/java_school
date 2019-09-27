package tp1;

public class TriBulle extends ConsoleService<int[], int[]> {

	@Override
	public int[] runWithControl(int[] numbers) {
		int tmp;
		int i;
		for (i = 0; i < numbers.length; i++) {
			for (int j = 1; j < (numbers.length - i); j++) {
				if (numbers[j - 1] > numbers[j]) {
					tmp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		System.out.println(i);
		return numbers;
	}

	public static void main(String[] args) {
		TriBulle tri = new TriBulle();
		int[] results = tri.runWithControl(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 });
		tri.assertEqual(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, results);

		results = tri.runWithControl(new int[] { 100, 40, 55, 10, 4, 0, 9, 199, 34, 91 });
		tri.assertEqual(new int[] { 0, 4, 9, 10, 34, 40, 55, 91, 100, 199 }, results);

	}
}
