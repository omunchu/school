package Lesson0831;

import java.util.Scanner;
public class Lesson010 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int x;
		int y;
		int z;
		int t;
		int sum = 0;

		System.out.print("整数１を入力＞");
		x = stdIn.nextInt();
		System.out.print("整数２を入力＞");
		y = stdIn.nextInt();
		System.out.print("偶数(1)・奇数(2)を選択＞");
		z = stdIn.nextInt();

		if( x > y ){
			t = x;
			x = y;
			y = t;
		}
		switch(z){
		case 1 :
			System.out.print(x + "から" + y + "までの偶数の合計は");
			if(x % 2 == 0){
				for(int i = x; i <= y ; i += 2){
				sum += i;
				}
			}else{
				for(int i = x + 1; i <= y ; i += 2){
				sum += i;
				}
			}
			System.out.print(sum);
			break;
		case 2:
			System.out.print(x + "から" + y + "までの奇数の合計は");
			if(x % 2 == 1){

				for(int i = x ; i <= y ; i += 2){
					sum += i;
				}
			}else{
				for(int i = x + 1; i <= y ; i += 2){
				sum += i;
				}
			}
			System.out.print(sum);
			break;

		}
			stdIn.close();
	}

}