package chap6;

import java.util.Random;
import java.util.Scanner;

public class L6_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0 ; i < n ; i++){
			a[i] = 1 + rand.nextInt(10);
		}

		// 棒グラフを出力
		// 値10から値1までループ
		for (int val = 10; val > 0; val--) {
			for (int i = 0; i < n; i++) {
				if (a[i] >= val) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
				System.out.print(' ');
			}
			System.out.println();
		}
		// -----------------------を出力
		for (int i = 0; i < n-1; i++) {
			System.out.print("--");
		}
		System.out.print('-');
		// 最後のインデックスを出力
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(i%10+ " ");
		}

		stdIn.close();
	}

}
