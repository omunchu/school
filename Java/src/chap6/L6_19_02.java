package chap6;

import java.util.Scanner;

public class L6_19_02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.print("クラス数:");
		int classs = stdin.nextInt();
		int points[][] = new int[classs][];

		for (int i = 0; i < classs; i++) {
			System.out.print((i + 1) + "組の人数:");
			int humans = stdin.nextInt();
			points[i] = new int[humans];
			for (int j = 0; j < humans; j++) {
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数:");
				points[i][j] = stdin.nextInt();
			}
		}
		stdin.close();

		System.out.println("  組 |   合計   平均 ");
		System.out.println("-----+---------------");
		int total = 0;
		double totalLength = 0;
		for (int i = 0; i < points.length; i++) {
			int sum = 0;
			double length = points[i].length;
			for (int j = 0; j < points[i].length; j++) {
				sum += points[i][j];
			}
			System.out.printf("%2d組 |   %4d  %5.1f \n", (i + 1), sum, sum / length);
			total += sum;
			totalLength += length;
		}
		System.out.println("-----+---------------");
		System.out.printf("  計 |   %4d  %5.1f \n", total, total / totalLength);

//		for (int i = 0; i < points.length; i++) {
//			System.out.print("{");
//			for (int j = 0; j < points[i].length; j++) {
//				System.out.print(points[i][j]+",");
//			}
//			System.out.println("}");
//		}
	}
}