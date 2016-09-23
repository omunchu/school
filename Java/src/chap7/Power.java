package chap7;

import java.util.Scanner;

public class Power {

//	static double power(double x , int n){
//		double tmp = 1.0;
//
//		for(int i = 0 ; i < n ; i++){
//			tmp *= x;
//		}
//		return tmp;
//	}

	static double power(double x , int n){
		double temp = 1.0;

		while(n-- > 0){
			temp *= x;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("aのb乗を求めます。");
		System.out.print("実数a：");
		double a = stdIn.nextDouble();
		System.out.print("整数b：");
		int b = stdIn.nextInt();

		System.out.println(a + "の" + b + "乗は" + power(a ,b) + "です。");
		stdIn.close();
	}

}
