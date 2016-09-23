package Lesson0831;

import java.util.Scanner;
public class Lesson015 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int y;
		int m;
		int d;
		int by;
		int bm;
		int bd;
		int old;

		System.out.print("今日の年は？＞");
		y = stdIn.nextInt();
		System.out.print("今日の月は？＞");
		m = stdIn.nextInt();
		System.out.print("今日の日は？＞");
		d = stdIn.nextInt();
		System.out.print("誕生日の年は？＞");
		by = stdIn.nextInt();
		System.out.print("誕生日の月は？＞");
		bm = stdIn.nextInt();
		System.out.print("誕生日の日は？＞");
		bd = stdIn.nextInt();

		old = y - by - 1;

		if(m > bm){
			old += 1;
		}else if(m == bm){
			if(d >= bd){
				old += 1;
			}
		}

		System.out.println("あなたの年齢は" + old + "です。");


		stdIn.close();
	}

}
