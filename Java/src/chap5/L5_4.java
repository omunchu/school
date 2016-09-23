package chap5;

import java.util.Scanner;

public class L5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値xとyとzの合計値と平均値を求めます。");
		System.out.print("xの値：");
		int x = stdIn.nextInt();
		System.out.print("yの値：");
		int y = stdIn.nextInt();
		System.out.print("zの値：");
		int z = stdIn.nextInt();

		int sum = x + y + z;
		double ave = sum / 3.0;

		System.out.println("xとyとzの合計値は" + sum+ "です。");
		System.out.println("xとyとzの平均値は" + ave +"です。");

		stdIn.close();
	}

}
