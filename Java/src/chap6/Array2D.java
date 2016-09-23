package chap6;

import java.util.Random;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("行数：");
		int height = stdIn.nextInt();

		System.out.print("列数：");
		int width = stdIn.nextInt();

		int[][] x = new int[height][width];

		for(int line = 0 ; line < height ; line++){
			for(int column = 0 ; column < width ; column++){
				x[line][column] = rand.nextInt(100);
				System.out.println("x[" + line + "][" + column + "] =" + x[line][column]);
			}
		}

		stdIn.close();

	}

}
