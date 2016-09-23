package Lesson0831;

import java.util.Scanner;
public class Lesson006 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int x;
		int y;

		System.out.print("先頭の整数を入力＞");
		x = stdIn.nextInt();
		System.out.print("末尾の整数を入力＞");
		y = stdIn.nextInt();

		if(y > x){
			for(int i = y; i >= x; i--){
				System.out.print(i + "  ");
			}
		}else{
			for(int i = y; i <= x; i++){
				System.out.print(i + "  ");

			}
		}

		stdIn.close();
	}

}
