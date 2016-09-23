package chap6;

import java.util.ArrayList;
import java.util.Scanner;
public class PointSumAveArrayList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		final int ninzu = 5;
		ArrayList<Integer> tensu = new ArrayList<Integer>();

		System.out.println(ninzu + "人の点数を入力せよ。");
		for(int i = 0 ; i < ninzu ; i++){
			System.out.print((i + 1) + "番目の点数：");
			tensu.add(stdIn.nextInt());
			sum += tensu.get(i);
		}

		System.out.println("合計は" + sum + "点数で。");
		System.out.println("平均は" + (double)sum / ninzu +"点です。");


		stdIn.close();

	}

}
