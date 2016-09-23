package Lesson0831;

import java.util.Scanner;

public class Lesson008 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int x;
		int y;
		int t;

		System.out.print("先頭の整数を入力＞");
		x = stdIn.nextInt();
		System.out.print("末尾の整数を入力＞");
		y = stdIn.nextInt();

		if(x > y){
			t = x;
			x = y;
			y = t;
		}

		System.out.println(x + "から" + y + "の偶数は");
		for(int i = x ; i <= y ; i += 2){
			System.out.print(i + "  ");
		}

		stdIn.close();
	}

}
