package ex0905;

import java.util.Scanner;
public class Kazuate {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int x = 50;		//Java君の解答
		int y = 25;		//解答していく度に加算or減算される数
		int n;

		System.out.println(x);

		System.out.println("当たり＞０：それより大きい＞１：それより小さい＞２");
		n = stdIn.nextInt();

		for (int sum = 0; n != 0 ; y = y / 2){

//			if(y == 0){
//				y = 1;
//			}
			y = Math.max(y,1);
			if(n == 2){
				sum -= y;
			}else{
				sum += y;

			}
			System.out.println(x + sum);

			System.out.println("当たり＞０：それより大きい＞１：それより小さい＞２");
			n = stdIn.nextInt();

		}

		System.out.println("どや");

		stdIn.close();
	}

}


//		do{
//		System.out.println(x + y);
//
//		System.out.println("当たり＞０：それより大きい＞１：それより小さい＞２");
//		n = stdIn.nextInt();
//
//		y = y * 5 / 10;
//		if(n == 2){
//			y *= (-1);
//		}else{
//
//		}
//
//		}while(n != 0);


