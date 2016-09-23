package Lesson0914;

public class SampleTester {

	public static void main(String[] args) {
		String[] names = {
							"たなか",
							"たかはし",
							"すずき",
							"さとう",
							"かとう",
							"いとう",
							"たなか",
							"たかはし",
							"かとう",
							"たなか"
		};

		String[] countName = Sample.countNames(names);

		System.out.print("\nメインでの結果={");
		for (String str :  countName) {
			System.out.print(str+",");
		}
		System.out.println("}");


	}

}
