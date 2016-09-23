package Lesson0831;

import java.util.Scanner;

public class Lesson012 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int i = 1;
		int ave = 0;
		int sum = 0;

		for(int x; ; i++){
			System.out.print("数値" + i + "を入力＞");
			x = stdIn.nextInt();
			if(x == 0){
				break;
			}
			sum += x;
			ave = sum / i;
		}

		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + ave + "です。");
		stdIn.close();
	}

}
