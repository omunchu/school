package chap5;

import java.util.Scanner;

public class L5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);





			System.out.println("変数xはflort型で、変数yはdouble型です");
			System.out.print("x ：");
			float x = stdIn.nextFloat();
			System.out.print("y ：");
			double y = stdIn.nextDouble();

			System.out.println("x = "+ x);
			System.out.println("y = "+ y);

//			float f = 0.1f;
//			double d = .1e-5;		このような表記になる。


		stdIn.close();

	}

}
