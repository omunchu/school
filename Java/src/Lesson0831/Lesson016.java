package Lesson0831;
import java.util.Scanner;
public class Lesson016 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int x;
		System.out.print("整数を入力＞"	);
		x = stdIn.nextInt();

		for(int i = 1 ; i <= x ; i++){
			for(int j = 1; j <= x ; j++){
			System.out.print("*  ");
			}
			System.out.println();

		}
		stdIn.close();
	}

}
