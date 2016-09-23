package chap7;

import java.util.Scanner;
public class L7_3 {

	static int med(int a , int b , int c){
		int ret = a;
		if((a < b && b < c) || (c < b && b < a)){
			ret = b;
		}
		if((a < c && c < b) || (b < c && c < a)){
			ret = c;
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		System.out.print("整数c：");
		int c = stdIn.nextInt();

		System.out.println("中央値は" + med(a ,b ,c) + "です。");

		stdIn.close();
	}

}
