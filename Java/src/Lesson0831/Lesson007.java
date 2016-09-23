package Lesson0831;

import java.util.Scanner;
public class Lesson007 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.print("整数を入力＞");
		n = stdIn.nextInt();

		for(int i = 2 ; i <= n ;i += 2){
			System.out.print(i + "  ");
		}
		stdIn.close();
	}

}
