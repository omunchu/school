package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class L6_19List {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.print("クラス数:");
		int classs = stdin.nextInt();
		ArrayList<ArrayList<Integer>> allpoints = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < classs; i++) {
			System.out.print((i + 1) + "組の人数:");
			int humans = stdin.nextInt();
			ArrayList<Integer> points = new ArrayList<Integer>();
			for (int j = 0; j < humans; j++) {
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数:");
				points.add(stdin.nextInt());
			}
			allpoints.add(points);
		}
		stdin.close();

		System.out.println("  組 |   合計   平均 ");
		System.out.println("-----+---------------");
		int total = 0;
		double totalLength = 0;
		for (int i = 0; i < allpoints.size(); i++) {
			int sum = 0;
			double length = allpoints.get(i).size();
			for (int j = 0; j < length; j++) {
				sum += allpoints.get(i).get(j);
			}
			System.out.printf("%2d組 |   %4d  %5.1f \n", (i + 1), sum, sum / length);
			total += sum;
			totalLength += length;
		}
		System.out.println("-----+---------------");
		System.out.printf("  計 |   %4d  %5.1f \n", total, total / totalLength);

		System.out.println();
		for (int i = 0; i < allpoints.size(); i++) {
			System.out.println(allpoints.get(i));
		}
	}
}