package chap4;

import java.util.Scanner;

public class DecimalFloat {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数x：");
		int x = stdIn.nextInt();

		System.out.print("実数y：");
		double y = stdIn.nextDouble();

		System.out.printf("x =%3d  y =%6.2f\n", x , y);
		stdIn.close();
	}

}
