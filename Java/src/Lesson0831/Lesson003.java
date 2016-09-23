package Lesson0831;

import java.util.Scanner;

public class Lesson003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int x;
		int y;
		int z;
		int max;
		int min;
		int ans;

		System.out.print("整数１を入力＞");
		x = stdIn.nextInt();
		System.out.print("整数２を入力＞");
		y = stdIn.nextInt();
		System.out.print("整数３を入力＞");
		z = stdIn.nextInt();

		if(x > y && y > z ){
			max = x;
			min = z;
			ans = max - min;
			System.out.println("最も大きい整数" + max + "と");
			System.out.println("最も小さい整数" + min + "の差は" + ans +"です。");
		}else if(x > z && z > y){
			max = x;
			min = y;
			ans = max - min;
			System.out.println("最も大きい整数" + max + "と");
			System.out.println("最も小さい整数" + min + "の差は" + ans +"です。");
		}else if(y > x && x > z){
			max = y;
			min = z;
			ans = max - min;
			System.out.println("最も大きい整数" + max + "と");
			System.out.println("最も小さい整数" + min + "の差は" + ans +"です。");
		}else if(y > z && z > x){
			max = y;
			min = x;
			ans = max - min;
			System.out.println("最も大きい整数" + max + "と");
			System.out.println("最も小さい整数" + min + "の差は" + ans +"です。");
		}else if(z > x && x > y){
			max = z;
			min = y;
			ans = max - min;
			System.out.println("最も大きい整数" + max + "と");
			System.out.println("最も小さい整数" + min + "の差は" + ans +"です。");
		}else if(z > y && y > x){
			max = z;
			min = x;
			ans = max - min;
			System.out.println("最も大きい整数" + max + "と");
			System.out.println("最も小さい整数" + min + "の差は" + ans +"です。");

		}



		stdIn.close();
	}

}
