package chap6;


import java.util.Scanner;

public class L6_6_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int ninzu;

		System.out.println("人数を入力せよ。");
		ninzu = stdIn.nextInt();
		int[] score = new int[ninzu];
		System.out.println(ninzu + "人の点数を入力せよ。");
		for(int i = 0 ; i < ninzu ; i++){
			System.out.print((i + 1) + "人目の点数：");
			score[i] = stdIn.nextInt();
		}

		int max = score[0];
		int min = score[0];
		int sum = score[0];
		int ave = 0;

		for(int i = 1 ; i < score.length ; i++){
			if(score[i] > max){
				max = score[i];
			}
			if(score[i] < min){
				min = score[i];
			}
			sum += score[i];
		}
		ave = sum / score.length;

		System.out.printf("合計点は%4d点です。\n" , sum);
		System.out.printf("平均点は%4d点です。\n" , ave);
		System.out.printf("最高点は%4d点です。\n" , max);
		System.out.printf("最低点は%4d点です。\n" , min);

		stdIn.close();
	}

}
