package chap6;
import java.util.Random;
import java.util.Scanner;
public class IntArrayRand {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0 ; i < n ; i++){
			a[i] = 1 + rand.nextInt(10);
		}

		for(int i = 0 ; i < n ; i++){
			System.out.print("a[" + i + "] ： ");
			for(int j = 0 ; j < a[i] ; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		stdIn.close();

	}

}
