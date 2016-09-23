package Lesson0831;

import java.util.Scanner;

public class Lesson002 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int x;
		int sum = 0;
		System.out.print("正の整数を入力してください。＞");

		x = stdIn.nextInt();

		for(int i = 0 ;i <= x ;i++){
			sum += i;
		}
		System.out.println("1 から" + x + "までの合計は" + sum + "です。");

		stdIn.close();

	}

}
