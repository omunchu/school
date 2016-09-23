package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class L6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int tot;
		System.out.print("何回入力するか：");
		tot = stdIn.nextInt();
		ArrayList<Double> a = new ArrayList<Double>();

		double sum = 0;
		for(int i = 0 ; i < tot ; i ++){
			System.out.print((i + 1) + "番目の数値：");
			a.add(stdIn.nextDouble());
			sum += a.get(i);
		}

//		double sum = 0;
//		for(double d : a){
//			sum += d;
//		}

		double ave = sum / a.size();
		System.out.printf("合計値は%5.1fです。\n" , sum);
		System.out.printf("平均値は%5.1fです。\n" , ave);

		stdIn.close();
	}

}
