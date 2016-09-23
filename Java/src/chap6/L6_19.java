package chap6;

import java.util.Scanner;
public class L6_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("クラス数：");
		int cl = stdIn.nextInt();
		System.out.println();

		int member= 0;
		int[][] score = new int[cl][];
		for(int i = 0 ; i < cl ; i++){
			System.out.print((i + 1) + "組の人数：");
			member = stdIn.nextInt();
			score[i] = new int[member];
			for(int j = 0 ,sum = 0; j < member ; j++){
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				score[i][j] = stdIn.nextInt();
			}

		}




		stdIn.close();
	}

}
