import java.util.Arrays;
import java.util.Random;

public class kSum {

	public static void main(String[] args) {

		Random gen = new Random();
		Integer[] input = new Integer[20];
		System.out.println(input.length);

		for (int i = 0; i < input.length; i++) {
			input[i] = Math.abs(gen.nextInt() % 50);
			System.out.print(input[i] + ",");
		}
		System.out.println();
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		Integer k = Integer.parseInt(args[0]);
		System.out.println();
		System.out.println("Trying to achieve sum of " + k);

		int l = 0;
		int r = (input.length) - 1;
		int count = 0;

		while (true) {
			count++;
			int tempSum = input[l];
			tempSum += input[r];
			if (tempSum > k) {
				r--;
			} else if (tempSum < k) {
				l++;
			} else if (tempSum == k) {
				break;
			}
			if (count > input.length) {
				System.out.println("nothing");
				return;
			}
		}
		System.out.println(l + "," + r + ", values : " + input[l] + ","
				+ input[r]);
	}
}
