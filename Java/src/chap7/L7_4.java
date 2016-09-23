package chap7;

import java.util.Scanner;

public class L7_4 {

	static int sumUp(int x){
		int ret = x;

		while(x-- > 0){
			ret += x;
		}
		return ret;
	}


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1から整数nまでの全整数の和を求めます。");
		System.out.print("整数n：");
		int n = stdIn.nextInt();

		System.out.println("1から" + n + "までの全整数の和は" + sumUp(n) + "です。");

		stdIn.close();
	}

}
