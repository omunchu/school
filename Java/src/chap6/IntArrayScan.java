package chap6;
import java.util.Scanner;
public class IntArrayScan {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0 ; i < n ; i ++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		for(int i = 0 ; i < n ; i ++){
			System.out.println("a[" + i + "] = " + a[i]);
		}

		stdIn.close();
	}

}
