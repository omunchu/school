package chap6;

import java.util.Scanner;
public class PointSumAveArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		final int ninzu = 5;
		int[] tensu = new int[ninzu];

		System.out.println(ninzu + "人の点数を入力せよ。");
		for(int i = 0 ; i < ninzu ; i++){
			System.out.print((i + 1) + "番の点数：");
			tensu[i] = stdIn.nextInt();
			sum += tensu[i];
		}

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double)sum / ninzu + "点です。");


		stdIn.close();
	}

}
