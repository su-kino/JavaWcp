
public class Chapter08 {
	public static void main(String[] args) {
		int num1 = 1;
		while (num1 < 5) {
			System.out.println(num1 * num1);
			num1++;
		}
		
		int array[] = {1, 2, 3, 4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int num2 : array) {
			if(num2 % 2 == 0) {
				continue;
			}
			System.out.println(num2);
		}
	}
}
