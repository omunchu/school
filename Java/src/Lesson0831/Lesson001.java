package Lesson0831;

import java.util.Scanner;

public class Lesson001 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int i;
		int j;
		int sum;


		System.out.println("２つの整数を入力してください。");
		System.out.print("整数１＞");
		i = stdIn.nextInt();
		System.out.print("整数２＞");
		j = stdIn.nextInt();

		sum =i + j;

		System.out.println(i + "と" + j + "の合計は" + sum + "です。");

		stdIn.close();

	}

}
