package Lesson0831;

import java.util.Scanner;

public class Lesson013 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int x;

		System.out.print("整数を入力＞");
		x = stdIn.nextInt();

		if(x >= 0 && x <= 10){
			System.out.println(x + "は0以上10以下です。");
		}else{
			System.out.println(x + "は0以上10以下ではないです。");

		}
		stdIn.close();

	}

}
