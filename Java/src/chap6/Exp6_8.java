package chap6;

import java.util.ArrayList;
import java.util.Scanner;
public class Exp6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();


		System.out.print("要素数を入力してください：");
		int count = stdIn.nextInt();
		int sum = 0;

		for(int i = 0 ; i < count ; i++){
			System.out.print((i + 1) + "番目の数値：");
			a.add(stdIn.nextInt());
//			sum += a.get(i);
		}

		for(int data : a){
			sum += data;
		}

		int ave = sum / a.size();

		System.out.println("合計値は" + sum + "です。");
		System.out.println("平均値は" + ave + "です。");

		stdIn.close();
	}

}
