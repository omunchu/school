package chap4;

import java.util.Random;
import java.util.Scanner;

class Kazuate{

	public static void main(String[] args){
		final int MAXNO=99;

		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no =rand.nextInt(MAXNO+1);

		System.out.println("数当てゲーム開始！！");
		System.out.println("0～" + MAXNO +"の数を当ててください。");

		int x;
		final int i = 3;
		int j = 0;
		System.out.println(i+ "回以内に当ててください！");

		do{
			System.out.print("いくつかな：");
			x =stdIn.nextInt();
			if( j == i){
				System.out.println("正解は"+ x +"でした！");
				break;
			}else if(x == no ){
				System.out.println("正解です。");
				break;
			}
			if(x > no){
					System.out.println("もっと小さな数だよ。");
				}else if(x < no){
					System.out.println("もっと大きな数だよ。");
			}
				j++;


		}while(x != no);

		stdIn.close();
	}


}
