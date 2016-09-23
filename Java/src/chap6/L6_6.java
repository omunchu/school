package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class L6_6 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> tensu = new ArrayList<Integer>();
		int ninzu;

		System.out.println("人数を入力せよ。");
		ninzu = stdIn.nextInt();
		System.out.println(ninzu + "人の点数を入力せよ。");
		for(int i = 0 ; i < ninzu ; i++){
			System.out.print((i + 1) + "人目の点数：");
			tensu.add(stdIn.nextInt());
		}

		int max = tensu.get(0);
		int min = tensu.get(0);
		int sum = tensu.get(0);
		int ave = 0;

		for(int i = 1 ; i < tensu.size() ; i++){
			if(tensu.get(i) > max){
				max = tensu.get(i);
			}
			if(tensu.get(i) < min){
				min = tensu.get(i);
			}
			sum += tensu.get(i);
		}
		ave = sum / tensu.size();

		System.out.printf("合計点は%4d点です。\n" , sum);
		System.out.printf("平均点は%4d点です。\n" , ave);
		System.out.printf("最高点は%4d点です。\n" , max);
		System.out.printf("最低点は%4d点です。\n" , min);

		stdIn.close();
	}

}
