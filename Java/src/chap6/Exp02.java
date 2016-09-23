package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exp02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<Integer>();

		final int member = 3;
		System.out.println(member + "人の点数を入力してください。");

		for( int i = 0 ; i < member ; i++ ){
			System.out.print((i + 1) + "人目の点数：");
			score.add(stdIn.nextInt());
		}

		int max = score.get(0);
		int min = score.get(0);

		for( int i = 0 ; i < score.size() ; i ++){
			if(score.get(i) > max){
				max = score.get(i);
			}
			if(score.get(i) < min){
				min = score.get(i);
			}
		}
		System.out.printf("最高点は%3d点です。\n" , max);
		System.out.printf("最低点は%3d点です。\n" , min);

	stdIn.close();
	}

}
