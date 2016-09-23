package Lesson0831;

import java.util.Scanner;
public class Lesson014 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int x;

		System.out.print("正の整数を入力＞");
		x = stdIn.nextInt();

		for(int i = 1; i <= x ;i++){

			if(i % 2 == 0 || i % 3 == 0){
				System.out.print(i + "  ");
			}
		}

		stdIn.close();
	}

}
