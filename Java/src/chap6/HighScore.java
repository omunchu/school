package chap6;

import java.util.ArrayList;
import java.util.Scanner;
public class HighScore {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> tensu = new ArrayList<Integer>();
		final int ninzu = 5;

		System.out.println(ninzu + "人の点数を入力せよ。");
		for(int i = 0 ; i < ninzu ; i++){
			System.out.print((i + 1) + "番目の点数：");
			tensu.add(stdIn.nextInt());
		}

		int max = tensu.get(0);
		for(int i = 0 ; i < tensu.size() ; i++){
			if(tensu.get(i) > max){
				max = tensu.get(i);
			}
		}
		System.out.println("最高点は" + max + "です。");

		stdIn.close();
	}


}
