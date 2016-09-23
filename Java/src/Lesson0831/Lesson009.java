package Lesson0831;

import java.util.Scanner;

public class Lesson009 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int x;
		int sum = 0;
		System.out.print("整数を入力＞");

		x = stdIn.nextInt();

		for(int i = 0 ;i <= x ;i++){
			sum += i;
		}
		System.out.println( x + "まで正の整数の合計は" + sum + "です。");

		stdIn.close();
	}

}
