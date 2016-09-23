package Lesson0831;

import java.util.Scanner;
public class Lesson005 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int n;
		int i = 1;
		System.out.print("整数を入力＞");
		n = stdIn.nextInt();

		for(; i <= n ;i++){
			System.out.print(i + "  ");
		}
		stdIn.close();

	}

}
