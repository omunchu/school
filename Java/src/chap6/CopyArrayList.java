package chap6;

import java.util.ArrayList;
import java.util.Scanner;
public class CopyArrayList {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		System.out.print("要素数：");
		int n = stdIn.nextInt();

		for(int i = 0 ; i < n ; i++){
			System.out.print("a(" + i + ") = " );
			a.add(stdIn.nextInt());
		}

		for(int i = 0 ; i < n ; i++){
			b.add(a.get(i));
		}

		System.out.println("aの全要素をbにコピーしました。");

		for(int i = 0 ; i < n ; i++){
			System.out.println("b(" + i + ") = " + b.get(i));
		}

		stdIn.close();
	}

}
