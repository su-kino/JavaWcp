
public class Chapter08 {
	public static void main(String[] args) {
//		1.[while]文
		int num1 = 1;
		while (num1 < 5) {
			System.out.println(num1 * num1);
			num1++;
		}
//		2,通常[for]文
		int array[] = {1, 2, 3, 4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		3,拡張[for]文
		for (int num2 : array) {
			if(num2 % 2 == 0) {
				continue;
			}
			System.out.println(num2);
		}
	}
}
