package chap10;

public class MinMaxTester {

	public static void main(String[] args) {
		int min = MinMax.min(10, 20, 30);
		System.out.println("min=" + min);
		int max = MinMax.max(30, 20, 10);
		System.out.println("max=" + max);

		int[] a = { 10, 20, 30, 40 };
		min = MinMax.min(a);
		System.out.println("\n配列min=" + min);
		max = MinMax.max(a);
		System.out.println("配列max=" + max);
	}
}
