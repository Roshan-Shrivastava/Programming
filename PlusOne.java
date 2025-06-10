import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        // Output: [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
        // Output: [1, 0, 0, 0]
    }
    public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;

			}
		}
		digits=new int[digits.length+1];
		digits[0]=1;
		return digits;
	}
}
