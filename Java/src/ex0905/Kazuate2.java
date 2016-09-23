package ex0905;

import java.util.Random;
import java.util.Scanner;
public class Kazuate2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int x = 50;		//Java君の解答
		int y = 25;		//解答していく度に加算or減算される数
		int n;
		int ans;
		int sum = 0;


		System.out.println("ランダムの２桁の整数を獲得します");
		n = rand.nextInt(90) + 10;

		System.out.println("java君の答え" + x);
		System.out.println("チミの答え" );
		ans = stdIn.nextInt();

		for (; n != x + sum && n != ans ; y /= 2){

//			if(y == 0){
//				y = 1;
//			}
			y = Math.max(y,1);
			if(x + sum > n){
				System.out.println("もっと小さいお");
				sum -= y;
			}else{
				System.out.println("もっと大きいお");
				sum += y;

			}
			if(ans > n){
				System.out.println("もっと小さいお");
			}else{
				System.out.println("もっと大きいお");
			}
			System.out.println();
			System.out.println("java君の答え" + (x + sum));

			System.out.println("チミの答え" );
			ans = stdIn.nextInt();


		}

		if(n == x + sum){
		System.out.println("どや");
		}else{
			System.out.println("チミの勝ちやで");
		}
		stdIn.close();
	}

}
